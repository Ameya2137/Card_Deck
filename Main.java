// Name: Ameya Tipnis
// PRN: 23070126012
// Batch: 2023-27 (A1)

// Main.java

import java.util.*; // Importing necessary Java utilities {Scanner, ArrayList, Collections.shuffle()}

// Defining Main class
class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object for user input
        Deck deck = new Deck(); // Creates an instance of the Deck class
        int choice;

        // Creating a do-while loop for a menu-driven program
        do {
            System.out.println("\n********** MENU OPERATIONS **********");
            System.out.println("1. Create Deck");
            System.out.println("2. Print Deck");
            System.out.println("3. Print a Card");
            System.out.println("4. Show Cards of the Same Suit");
            System.out.println("5. Compare Cards (Same Rank)");
            System.out.println("6. Pick a Card");
            System.out.println("7. Deal 5 Random Cards");
            System.out.println("8. Shuffle Deck");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Creating a switch-case statement that executes different methods based on user input
            switch (choice) {
                case 1:
                    deck.createDeck(); // To generate a standard 52-card deck
                    break;
                case 2:
                    deck.displayDeck(); // To display all the cards
                    break;
                case 3:
                    // Prompting the user to enter the rank & suit
                    System.out.print("Enter rank of the card (e.g., Ace, 2, ..., Jack, Queen, King): ");
                    scanner.nextLine(); // Consume newline
                    String rank = scanner.nextLine();
                    System.out.print("Enter suit of the card (Clubs, Spades, Diamonds, Hearts): ");
                    String suit = scanner.nextLine();
                    deck.printCard(rank, suit); // To display the requested card
                    break;
                case 4:
                    // Prompting the user to enter the suit
                    System.out.print("Enter a suit (Clubs, Spades, Diamonds, Hearts): ");
                    scanner.nextLine(); // Consume newline
                    String cardSuit = scanner.nextLine();
                    deck.sameCard(cardSuit); // To display cards in the same suit
                    break;
                case 5:
                    // Prompting the user to enter the rank
                    System.out.print("Enter a rank to find matching cards (e.g., Ace, 2, ..., Jack, Queen, King): ");
                    scanner.nextLine(); // Consume newline
                    String cardRank = scanner.nextLine();
                    deck.compareCard(cardRank); // To display cards of similar rank
                    break;
                case 6:
                    // Prompting the user to enter the rank & suit
                    System.out.print("Enter rank of the card (e.g., Ace, 2, ..., Jack, Queen, King): ");
                    scanner.nextLine(); // Consume newline
                    String findRank = scanner.nextLine();
                    System.out.print("Enter suit of the card (Clubs, Spades, Diamonds, Hearts): ");
                    String findSuit = scanner.nextLine();
                    deck.findCard(findRank, findSuit); // To display the found card of similar rank & suit
                    break;
                case 7:
                    deck.dealCard(); // To display or deal 5 random cards
                    break;
                case 8:
                    deck.shuffleDeck(); // To randomly reorder the printed deck
                    break;
                case 9:
                    System.out.println("Exiting program..."); // Displaying an exit message and terminates loop
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option."); // If a number between 1-9 not entered, this error message this displayed
            }
        } while (choice != 9); // The program keeps running until user selects 9 (Exit)

        scanner.close(); // Closing the Scanner to prevent resource leaks
    }
}
