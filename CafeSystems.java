import java.util.ArrayList;

public class CafeSystems {
    public static void main(String args[]) {

        double change, tendered;
        int choice, payment, cardtype, EXIT;

        // Declaring objects
        Menu themenu = new Menu();
        TransactionFile transactions = new TransactionFile();
        Keyboard kb = new Keyboard();

        // Declaring arraylist object
        ArrayList<MenuItem> items = new ArrayList<MenuItem>();

        // Read menu text file
        themenu.ReadFile("Menu.txt", items);

        // Declare exit option
        EXIT = items.size() + 1;

        // Display menu
        themenu.displayMenu(items);

        // Choice validation for menu
        choice = kb.readInteger(1, EXIT);

        // Menu loops as long as != EXIT
        while (choice != EXIT) {

            // Declare whats inside the Arraylist
            MenuItem cafeitem = items.get(choice - 1);

            System.out.println("You order: " + cafeitem.getcafeitem());
            System.out.printf("The price = €%.2f\n", cafeitem.getprice());

            System.out.println("Would you like to pay with [1] Cash or [2] Card?.");
            // Cash or card validation
            payment = kb.cashOrCard(1, 2);
            // Cash selected by user
            if (payment == 1) {
                System.out.println("Please enter amount tendered.");
                // Payment validation
                tendered = kb.amountTendered(cafeitem.getprice());
                change = tendered - cafeitem.getprice();
                System.out.printf("Here is your order of %s and change %.2f\n", cafeitem.getcafeitem(), change);
                transactions.cashTransaction("transactions.txt", cafeitem.getcafeitem(), cafeitem.getprice(), tendered, change);
            } 
            // Card selected by user
            else if (payment == 2) {
                System.out.println("You chose card, please select [1] Visa or [2] MasterCard.");
                // Card type validation
                cardtype = kb.visaOrMaster(1, 2);
                // Visa
                if (cardtype == 1) {
                    System.out.printf("You have selected Visa and successfully payed.");
                    System.out.printf(" Here is your order of %s\n", cafeitem.getcafeitem());
                    // Creates a record of transaction and creates transactions.txt
                    transactions.visa("transactions.txt", cafeitem.getcafeitem(), cafeitem.getprice());
                // MasterCard
                } else if (cardtype == 2) {
                    System.out.printf("You have selected MasterCard and successfully payed.");
                    System.out.printf(" Here is your order of %s\n", cafeitem.getcafeitem());
                    // Creates a record of transaction and creates transactions.txt
                    transactions.master("transactions.txt", cafeitem.getcafeitem(), cafeitem.getprice());
                }
            }
            // Loop menu
            items.get(choice - 1);

            // Display menu
            themenu.displayMenu(items);
            
            // Choice validation for menu
            choice = kb.readInteger(1, EXIT);

        }
        System.out.println("Goodbye and thank for stopping by.");
    }

}