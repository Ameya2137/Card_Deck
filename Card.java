//Card.java

// Defining Card class to represent a single playing card
class Card{
	String rank; // Ace, 2, ..., Jack, Queen, King
	String suit; // Clubs, Diamonds, Hearts, Spades

	public Card(String rank, String suit){
    // Assigning a parameter variable to an instance variable
		this.rank = rank;
		this.suit = suit;
	}

  // Returns a formatted string representation of the card
	public String toString(){
		return rank+" of "+ suit;
	}
}
