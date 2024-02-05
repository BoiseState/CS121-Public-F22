import java.util.Scanner;

/**
 * Demonstrate a console menu using switch statement.
 * 
 * @author mvail
 */
public class MenuDemo {
    public static void main(String[] args) {

        final String MENU = "(Q)uit\n"
                + "(J)oke\n"
                + "(M)enu\n"
                + "(A)verage\n";

        final String PROMPT = "Please enter your choice (or 'M' for menu): ";

        String input = "M";

        // ONLY EVER ONE SCANNER CONNECTED TO KEYBOARD IN A PROGRAM!
        Scanner kbd = new Scanner(System.in);

        while (!input.equals("Q")) {
            switch (input) {
                case "J":
                    break;
                case "M":
                    System.out.println(MENU);
                    break;
                case "A":
                    break;
                default:
                    System.out.println("That is not a valid choice. Try again.");
            }

            System.out.print(PROMPT);
            // remove leading/trailing whitespace and correct for upper/lowercase
            input = kbd.nextLine().trim().toUpperCase();

        } // end while loop

        System.out.println("Goodbye.");

        kbd.close(); // close Scanner at the very end, after no more input
    }
}
