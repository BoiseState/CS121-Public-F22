import java.awt.Point;

import java.awt.Point;

/**
 * Demonstrates how to use the Point object.
 * @author CS121 instructors
 */
public class Coordinates
{
    public static void main(String[] args)
    {
	// Declare and instantiate object
        Point origin = new Point(10, 20);

	// Invoke getX method and store result
      	double x = origin.getX();

	// Print the x coordinate
      	System.out.println("Origin X: " + x);

        // Set origin (x,y) to (0,0)
        origin.setLocation(0, 0);

        // Get a String describing origin
	System.out.println(origin.toString()); 


    }
}
