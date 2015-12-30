package wargameame;

// I use UTF-8 encoding to display cards symbols!

public class War {
	
	static int cardsPlayed = 0;
	static int warIndex = 0;
	
	// Compares the cards played and returns result
	public static int outcomeOfMove(Player player1, Player player2) {
		if(player1.deckOfPlayer.cardsInDeck[cardsPlayed].getStrength()
			> player2.deckOfPlayer.cardsInDeck[cardsPlayed].getStrength()) {
			return 1;
		} else {
			if(player1.deckOfPlayer.cardsInDeck[cardsPlayed].getStrength()
				< player2.deckOfPlayer.cardsInDeck[cardsPlayed].getStrength()) {
			return -1;
			} else {
				return 0;
			}
		}
	}
	
	// Prints the move(which player played what card)
	public static void printMove(Player player1, Player player2) {
		System.out.println("Player " + player1.getNumberOfPlayer() + " played " + 
			player1.deckOfPlayer.cardsInDeck[cardsPlayed].getName() + player1.deckOfPlayer.cardsInDeck[cardsPlayed].getColor() + ". " + 
			"Player " + player2.getNumberOfPlayer() + " played " + 
			player2.deckOfPlayer.cardsInDeck[cardsPlayed].getName() + player2.deckOfPlayer.cardsInDeck[cardsPlayed].getColor() + ". ");
	}
	
	// Adds the hand to the winners deck of won cards
	public static void takesTheHand(Player winner, Player loser, int index) {
		winner.wonDeckOfPlayer.cardsInDeck[(cardsPlayed-index)*2] = winner.deckOfPlayer.cardsInDeck[(cardsPlayed-index)];
		winner.wonDeckOfPlayer.cardsInDeck[(cardsPlayed-index)*2+1] = loser.deckOfPlayer.cardsInDeck[(cardsPlayed-index)];
	}
	
	//Takes the hand, prints message, goes to the next move
	public static void winningMove(Player winner, Player loser) {
		takesTheHand(winner, loser, 0);
		System.out.println("Player " + winner.getNumberOfPlayer() + " takes the hand.");
		cardsPlayed++;
	}
	
	//If the third card in a war is the same, or we have war somewhere at the end
	public static void continuousWar(Player player1, Player player2) {
		if(cardsPlayed == 25) {
			return;
		} else {
			while((cardsPlayed < 25) && (player1.deckOfPlayer.cardsInDeck[cardsPlayed].getStrength() ==
					player2.deckOfPlayer.cardsInDeck[cardsPlayed].getStrength())) {
				cardsPlayed++;
			}
			int result = outcomeOfMove(player1, player2);
			if(result == 1) {
				System.out.println("Player 1 wins the war.");
				for(int index = 0; index <= cardsPlayed - warIndex; index++) {
					takesTheHand(player1, player2, index);
				}
			} else {
				if(result == -1) {
					System.out.println("Player 2 wins the war.");
					for(int index = 0; index <= cardsPlayed - warIndex; index++) {
						takesTheHand(player2, player1, index);
					}
				}
			}
		}
				
	}

	//When the cards played are the same
	public static void warMoves(Player player1, Player player2) {
		warIndex = cardsPlayed;
		printMove(player1, player2);
		System.out.println("War!");
		for(int index = 0; index < 3; index++) {
			if(cardsPlayed < 25) {
				cardsPlayed++;
				printMove(player1, player2);
			}
		}

		int result = outcomeOfMove(player1, player2);
		if(result == 1) {
			System.out.println("Player 1 wins the war.");
			for(int index = 0; index <= cardsPlayed - warIndex; index++) {
				takesTheHand(player1, player2, index);
			}
		} else {
			if(result == -1) {
				System.out.println("Player 2 wins the war.");
				for(int index = 0; index <= cardsPlayed - warIndex; index++) {
					takesTheHand(player2, player1, index);
				}
			} else {
				continuousWar(player1, player2);
			}
		}
	}
	
	//Plays a move, main method
	public static void play(Player player1, Player player2) {
		int result = outcomeOfMove(player1, player2);
		if(result == 1) {
			printMove(player1, player2);
			winningMove(player1, player2);
		} else {
			if(result == -1) {
				printMove(player1, player2);
				winningMove(player2, player1);
			} else {
				warMoves(player1, player2);
			}
		}
		if(cardsPlayed < 26) {
			play(player1, player2);
		} else {
			return;
		}
	}
	
	//Determines who is the winner
	public static void winner (Player player1, Player player2) {
		if(player1.getWonCards() > player2.getWonCards()) {
			System.out.println("Player " + player1.getNumberOfPlayer() + " wins the game!");
		} else {
			if(player1.getWonCards() < player2.getWonCards()) {
				System.out.println("Player " + player2.getNumberOfPlayer() + " wins the game!");
			} else {
				System.out.println("The game is a tie!");
			}
		}
	}

	//Main function
	public static void main(String[] args) {
		
		Deck deck = new Deck(52);
		Player player1 = new Player(1, deck.getNumberOfCards()/2);
		Player player2 = new Player(2, deck.getNumberOfCards()/2);
		
		deck.getArrangedDeck();
		System.out.print("Arranged deck : ");
		deck.printDeck();
		
		deck.shuffleDeck();
		System.out.print("Shuffled deck : ");
		deck.printDeck();
		
		player1.getADeck(deck);
		player2.getADeck(deck);
		
		System.out.print("Player " + player1.getNumberOfPlayer() + " deck : ");
		player1.deckOfPlayer.printDeck();
		System.out.print("Player " + player2.getNumberOfPlayer() + " deck : ");
		player2.deckOfPlayer.printDeck();
		
		System.out.println("Game is starting : ");
		play(player1, player2);
		
		player1.calculateNumberOfWonCards();
		player2.calculateNumberOfWonCards();
		
		winner(player1, player2);

		System.out.print("Player " + player1.getNumberOfPlayer() + " won cards : ");
		player1.wonDeckOfPlayer.printDeck();
		System.out.print("Player " + player2.getNumberOfPlayer() + " won cards : ");
		player2.wonDeckOfPlayer.printDeck();
	}

}
