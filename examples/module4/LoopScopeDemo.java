/**
 * Demo variable scope in relation to a loop.
 * @author mvail
 */
public class LoopScopeDemo {
    public static void main(String[] args) {
        int low = 20, high = 70;
        int sum = 0; //sum has to be declared outside the loop to still exist after loop

        for (int i = low; i <= high; i++) {
            //int sum = 0; //creates a LOCAL variable inside the loop - not what you want
            sum += i;
        }

        System.out.println("sum from " + low + " to " + high + ": " + sum);
    }
}
