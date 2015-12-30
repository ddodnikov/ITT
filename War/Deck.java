package wargameame;

public class Deck {

	Card[] cardsInDeck;
	private int numberOfCards;
	
	public int getNumberOfCards() {
		return numberOfCards;
	}

	public void setNumberOfCards(int numberOfCards) {
		if(numberOfCards > 0 && numberOfCards % 2 == 0) {
			this.numberOfCards = numberOfCards;
		}
	}

	Deck(int numberOfCards) {
		this.cardsInDeck = new Card[numberOfCards];
		this.setNumberOfCards(numberOfCards);
		for(int index = 0; index < this.getNumberOfCards(); index++) {
			this.cardsInDeck[index] = new Card();
		}
	}

	//Prints the cards in the deck
	void printDeck() {
		for(int index = 0; index < this.getNumberOfCards(); index++) {
			System.out.print(this.cardsInDeck[index].getName() + this.cardsInDeck[index].getColor() + ",");
		}
		System.out.println();
	}

	//Creates an arranged deck
	void getArrangedDeck() {
				
		int strength = 1;
		
		for(int index = 0; index < this.numberOfCards; index++) {

			if((index+1)%4==0) {
				this.cardsInDeck[index].setColor('\u2660');
			} else {
				if((index+2)%4==0) {
					this.cardsInDeck[index].setColor('\u2665');
				} else {
					if((index+3)%4==0) {
						this.cardsInDeck[index].setColor('\u2666');
					} else {
						this.cardsInDeck[index].setColor('\u2663');
					}
				}
			}
			
			this.cardsInDeck[index].setStrength(strength);
			if((index+1) % 4 == 0){
				strength++;
			}
			
			if (index >= 0 && index <= 3) {
				this.cardsInDeck[index].setName("2");
			}
			if (index >= 4 && index <= 7) {
				this.cardsInDeck[index].setName("3");
			}
			if (index >= 8 && index <= 11) {
				this.cardsInDeck[index].setName("4");
			}
			if (index >= 12 && index <= 15) {
				this.cardsInDeck[index].setName("5");
			}
			if (index >= 16 && index <= 19) {
				this.cardsInDeck[index].setName("6");
			}
			if (index >= 20 && index <= 23) {
				this.cardsInDeck[index].setName("7");
			}
			if (index >= 24 && index <= 27) {
				this.cardsInDeck[index].setName("8");
			}
			if (index >= 28 && index <= 31) {
				this.cardsInDeck[index].setName("9");
			}
			if (index >= 32 && index <= 35) {
				this.cardsInDeck[index].setName("10");
			}
			if (index >= 36 && index <= 39) {
				this.cardsInDeck[index].setName("J");
			}
			if (index >= 40 && index <= 43) {
				this.cardsInDeck[index].setName("Q");
			}
			if (index >= 44 && index <= 47) {
				this.cardsInDeck[index].setName("K");
			}
			if (index >= 48 && index <= 51) {
				this.cardsInDeck[index].setName("A");
			}
			
		}
	}
	
	//Shuffles the deck randomly
	void shuffleDeck() {
		for(int index = 0; index < this.getNumberOfCards(); index++) {
			int randomNumber = index + (int)(Math.random() * (this.getNumberOfCards() - index));
			Card temp = this.cardsInDeck[randomNumber];
			this.cardsInDeck[randomNumber] = this.cardsInDeck[index];
			this.cardsInDeck[index] = temp;
		}
	}
	
}
