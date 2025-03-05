// Deck.java

import java.util.*; // Importing necessary Java utilities {ArrayList, Random, Collections.shuffle()}

// Defining Deck class for all deck-related operations
class Deck {
    private ArrayList<Card> deck;

    // Constructor that initializes the deck
    public Deck() {
        this.deck = new ArrayList<>();
    }
