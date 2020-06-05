import java.util.ArrayList;
import java.io.*;

public class Menu {
    // Method for reading the menu file
    public void ReadFile(String filename, ArrayList<MenuItem> menuitems) { // Parameters to be used in main
        try {
            // Declaring file reader
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            // Declaring the reading of each line from text file
            String line;

            // While line is not empty, keep reading
            while ((line = br.readLine()) != null) {

                // Tokens to identify items within inventory with a comma
                String item[] = line.split(",");

                // After identifying the split of names and prices, make names = what comes before the comma
                String cafeitem = item[0];

                // Parse values into a double
                double price = Double.parseDouble(item[1]);

                // Populate arraylist
                MenuItem li = new MenuItem(cafeitem, price);
                menuitems.add(li);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Error - could not read file, or " + filename + " does not exist.");
        }
    }

    public void displayMenu(ArrayList<MenuItem> menuitems) {
        System.out.printf("Menu\n");
        System.out.printf("================================\n");
        // Loop to get contents of MenuItems arraylist
        for (int i = 0; i < menuitems.size(); i++) {
            // Declaring MenuItem to use methods of MenuItem object
            MenuItem li = menuitems.get(i);
            System.out.printf("%d. %s €%.2f \n", i + 1, li.getcafeitem(), li.getprice());
        }
        // Exit option
        System.out.printf("%d. Exit\n", menuitems.size() + 1);
        System.out.printf("================================\n\n");
    }
}