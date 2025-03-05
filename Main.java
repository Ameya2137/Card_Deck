// Name: Ameya Tipnis
// PRN: 23070126012
// Batch: 2023-27 (A1)

// Main.java

import java.util.*; // Importing all java utilities 

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
