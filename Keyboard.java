import java.util.Scanner;

public class Keyboard {

    private Scanner in;

    public Keyboard(){
        // Setup Scanner
        in = new Scanner(System.in);
    }

    public int readInteger(int low, int high){

        int num = 0;

        String strInput;

        boolean valid = false;

        // Keep looking until valid input
        while(valid == false){

            // Grab input from keyboard
            strInput = in.nextLine();

            // Try to convert String to int
            try{
                num = Integer.parseInt(strInput);

                if(num >= low && num <= high)
                    valid = true;
                else
                System.out.println("Item is not on the menu");
            }
            catch(NumberFormatException e){
                System.out.println("Error - please enter an integer value.");
            }
        }
        return num;
    }

    public int cashOrCard(int low, int high){

        int num = 0;

        String strInput;

        boolean valid = false;

        // Keep looking until valid input
        while(valid == false){

            // Grab input from keyboard
            strInput = in.nextLine();

            // Try to convert String to int
            try{
                num = Integer.parseInt(strInput);

                if(num >= low && num <= high)
                    valid = true;
                else
                System.out.println("Error - invalid payment type.");
            }
            catch(NumberFormatException e){
                System.out.println("Error - please enter an integer value.");
            }
        }
        return num;
    }

    public double amountTendered(double low){

        double num = 0;

        String strInput;

        boolean valid = false;

        // Keep looking until valid input
        while(valid == false){

            // Grab input from keyboard
            strInput = in.nextLine();

            // Try to convert String to int
            try{
                num = Double.parseDouble(strInput);

                if(num >= low )
                    valid = true;
                else
                System.out.println("Error - amount tendered is too low");
            }
            catch(NumberFormatException e){
                System.out.println("Error - please enter a numeric value.");
            }
        }
        return num;
    }

    public int visaOrMaster(int low, int high){

        int num = 0;

        String strInput;

        boolean valid = false;

        // Keep looking until valid input
        while(valid == false){

            // Grab input from keyboard
            strInput = in.nextLine();

            // Try to convert String to int
            try{
                num = Integer.parseInt(strInput);

                if(num >= low && num <= high)
                    valid = true;
                else
                System.out.println("Error - invalid payment type.");
            }
            catch(NumberFormatException e){
                System.out.println("Error - please enter an integer value.");
            }
        }
        return num;
    }
}