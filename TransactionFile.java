import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class TransactionFile {
    // Declaration for DateTime formatter
    DateTimeFormatter time = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss ");
    LocalDateTime now = LocalDateTime.now();

    // Method for cash transactions
    public void cashTransaction(String filename, String item, double price, double pay, double change) {
        try {
            // Declaring file reader
            FileWriter fw = new FileWriter(filename, true);
            PrintWriter pw = new PrintWriter(fw);

            // Prints time into transaction file
            pw.print(time.format(now));
            // Prints item, price, pay and change into transaction file
            pw.printf("%s, €%.2f ,€%.2f ,€%.2f\n", item, price, pay, change);
            pw.close();
        }

        catch (IOException e) {
            System.out.printf("Error file: " + filename + " can't be written");
        }
    }

    public void visa(String filename, String item, double price) {
        try {
            // Declaring file reader
            FileWriter fw = new FileWriter(filename, true);
            PrintWriter pw = new PrintWriter(fw);

            // Prints time into transaction file
            pw.print(time.format(now));
            // Prints item, price, pay and change into transaction file
            pw.printf("%s, €%.2f Visa\n", item, price);
            pw.close();
        }

        catch (IOException e) {
            System.out.printf("Error can't write to file: " + filename);
        }
    }

    public void master(String filename, String item, double price) {
        try {
            // Declaring file reader
            FileWriter fw = new FileWriter(filename, true);
            PrintWriter pw = new PrintWriter(fw);

            // Prints time into transaction file
            pw.print(time.format(now));
            // Prints item, price, pay and change into transaction file
            pw.printf("%s, €%.2f MasterCard\n", item, price);
            pw.close();
        }

        catch (IOException e) {
            System.out.printf("Error can't write to file: " + filename);
        }
    }
}
