package wargameame;

public class Player {
	
	private int numberOfPlayer;
	Deck deckOfPlayer;
	Deck wonDeckOfPlayer;
	private int wonCards;
				
	public int getWonCards() {
		return wonCards;
	}

	public void setWonCards(int wonCards) {
		this.wonCards = wonCards;
	}

	public int getNumberOfPlayer() {
		return numberOfPlayer;
	}

	public void setNumberOfPlayer(int number) {
		if(number > 0) {
			this.numberOfPlayer = number;
		}
	}

	Player(int number, int numberOfCards) {
		this.setNumberOfPlayer(number);
		this.deckOfPlayer = new Deck(numberOfCards);
		this.wonDeckOfPlayer = new Deck(numberOfCards*2);
		for(int index = 0; index < this.deckOfPlayer.getNumberOfCards(); index++) {
			this.deckOfPlayer.cardsInDeck[index] = new Card();
		}
		for(int index = 0; index < this.wonDeckOfPlayer.getNumberOfCards(); index++) {
			this.wonDeckOfPlayer.cardsInDeck[index] = new Card();
		}
	}
	
	//Deals the cards one at a time for each player
	void getADeck (Deck deck) {
		if(this.getNumberOfPlayer() == 1) {
			for(int index = 0; index < this.deckOfPlayer.getNumberOfCards(); index++) {
				this.deckOfPlayer.cardsInDeck[index] = deck.cardsInDeck[index*2];
			}
		} else {
			for(int index = 0; index < this.deckOfPlayer.getNumberOfCards(); index++) {
				this.deckOfPlayer.cardsInDeck[index] = deck.cardsInDeck[index*2+1];
			}
		}
	}
	
	
	//Calculates how many cards a player has won
	void calculateNumberOfWonCards () {
		for(int index = 0; index < this.wonDeckOfPlayer.cardsInDeck.length; index++) {
			if(this.wonDeckOfPlayer.cardsInDeck[index].getName() != " ") {
				this.setWonCards(this.getWonCards()+1);
			}
		}
		System.out.println("Player " + this.getNumberOfPlayer() + " number of won cards : " + this.getWonCards());
	}
	
}
