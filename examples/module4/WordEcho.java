import java.util.Scanner;

public class WordEcho {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String again = "y";
        while (again.equals("y")) {
            System.out.print("Enter a sentence: ");
            String input = kbd.nextLine();
            Scanner lineScan = new Scanner(input);
            while (lineScan.hasNext()) {
                String token = lineScan.next();
                System.out.println(token);
            }
            lineScan.close();
            System.out.print("Do you want to do another? (y to continue, anything else to quit): ");
            again = kbd.nextLine();
        }
        kbd.close();
    }
}
