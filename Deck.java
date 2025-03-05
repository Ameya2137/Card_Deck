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
