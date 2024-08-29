import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * A mouse odometer.
 * @author amit, CS121 Instructors
 *
 */

/* Notice that MouseOdometer is-a JFrame */
@SuppressWarnings("serial")
public class MouseOdometer extends JFrame
{

	/* This is the driver class. */
	public static void main(String[] args) {
		/* calling the MouseOdometer constructor uses the inherited JFrame constructor. */		
		MouseOdometer mouseMeter = new MouseOdometer();

		/* This section sets some default startup options for the JFrame */
		mouseMeter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mouseMeter.setPreferredSize(new Dimension(300, 200));

		/* Here is where the panel is added the JFrame */
		mouseMeter.add(new MouseOdometerPanel());

		/* And finally the bits to make it all appear as expected. */
		mouseMeter.pack();
		mouseMeter.setVisible(true);
	}
}
