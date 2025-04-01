import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Log intput lines to a file. Allow user to choose between file replacement or
 * appending.
 * @author mvail
 */
public class FileWriter {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        File outputFile = new File("log.out");

        // prompt for choice of replace or append
        System.out.print("Choose 'R' for replacing or 'A' for appending: ");
        char choice = kbd.nextLine().trim().toUpperCase().charAt(0);

        // configure PrintWriter according to prior choice
        PrintWriter pw = null;
        try {
            switch (choice) {
                case 'R':
                    pw = new PrintWriter(outputFile); //replaces any existing file with given name
                    break;
                case 'A':
                    pw = new PrintWriter(new FileOutputStream(outputFile, true)); //appends to existing file with given name
                    break;
                default:
                    System.out.println("You chose poorly. No file for you!");
                    kbd.close(); //close Scanners when done with them
                    return; // exits main()
            }
        } catch (FileNotFoundException e) {
            System.out.println("Sorry. Unable to open \"" + outputFile.getName() + "\".");
            kbd.close(); //close Scanners when done with them
            return; // exits main()
        }

        // write input lines to file until a blank line is entered
        final String PROMPT = "Enter a line of input or a blank line to quit: ";
        System.out.print(PROMPT);
        String line = kbd.nextLine().trim();
        while (line.length() != 0) {
            pw.println(line); //write current line to output file using PrintWriter
            System.out.print(PROMPT); // prompt for next line
            line = kbd.nextLine().trim(); // get next line
        }

        // close Scanners when you're done with them
        kbd.close();

        // do not forget to close the PrintWriter, or you may very well not get your
        // file written!
        pw.close();

        // report where output went before exiting the program
        System.out.println("Input recorded in file \"" + outputFile.getName() + "\".");
    }
    
}
