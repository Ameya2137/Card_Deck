// Deck.java

import java.util.*; // Importing necessary Java utilities {ArrayList, Random, Collections.shuffle()}

// Defining Deck class for all deck-related operations
class Deck {
    private ArrayList<Card> deck;

    // Constructor that initializes the deck
    public Deck() {
        this.deck = new ArrayList<>();
    }

    // a) Create the deck of 52 cards
    public void createDeck() {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};

        deck.clear(); // Clear the deck before creating a new one

        // Iterating through each rank and then each suit to add a new card
        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(new Card(rank, suit));
            }
        }
        System.out.println("Deck successfully created!");
    }

    // b) Print all cards in the deck
    public void displayDeck() {
        // Loops through the entire deck and prints each card
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    // c) Print a specific card if it exists
    public void printCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.rank.equalsIgnoreCase(rank) && card.suit.equalsIgnoreCase(suit)) { // Case-insensitive for both rank & suit
                // If a match is found, print it and exit the loop
                System.out.println("Card Found: " + card);
                return;
            }
        }
        // If card not found, print error message
        System.out.println("Card not found.");
    }

    // d) Find all cards with the same suit
    public void sameCard(String suit) { // Finds and prints all cards of a given suit
        System.out.println("Cards with the suit " + suit + ":");
        boolean found = false; // Intializes found to false 
        for (Card card : deck) {
            // Checks if each card matches, and if found prints card ans sets to true
            if (card.suit.equalsIgnoreCase(suit)) {
                System.out.println(card);
                found = true;
            }
        }
        // If no cards were found, display an error message
        if (!found) {
            System.out.println("No cards found with the suit " + suit);
        }
    }

    // e) Find all cards with the same rank
    public void compareCard(String rank) { // Finds and prints all cards of a given rank
        System.out.println("Cards with the same rank (" + rank + "):");
        boolean found = false; // Intializes found to false 
        for (Card card : deck) {
            // Checks if each card matches, and if found prints card ans sets to true
            if (card.rank.equalsIgnoreCase(rank)) {
                System.out.println(card);
                found = true;
            }
        }
        // If no cards were found, display an error message
        if (!found) {
            System.out.println("No cards found with the rank " + rank);
        }
    }

    // f) Find a specific card in the deck
    public boolean findCard(String rank, String suit) { // Checks if a specific card exists.
        for (Card card : deck) {
            // If found, print the card and return true.
            if (card.rank.equalsIgnoreCase(rank) && card.suit.equalsIgnoreCase(suit)) {
                System.out.println("Card Found: " + card);
                return true;
            }
        }
        // If not found, print the card and return false.
        System.out.println("Card not found.");
        return false;
    }

    // g) Deal 5 random cards
    public void dealCard() {
        // If the deck has less than 5 cards, print an error
        if (deck.size() < 5) {
            System.out.println("Not enough cards in the deck to deal 5 cards.");
            return;
        }
        // Creates a new list dealtCards to store the 5 random cards
        System.out.println("5 Random Cards from the Deck:");
        ArrayList<Card> dealtCards = new ArrayList<>();
        Random rand = new Random();

        // Uses rand.nextInt(deck.size()) to pick random indices
        for (int i = 0; i < 5; i++) {
            int randomIndex = rand.nextInt(deck.size());
            dealtCards.add(deck.get(randomIndex));
        }

        // Prints the selected cards
        for (Card card : dealtCards) {
            System.out.println(card);
        }
    }
