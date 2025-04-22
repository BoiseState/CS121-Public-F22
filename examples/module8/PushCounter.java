import javax.swing.JFrame;

/** Demonstrates a graphical user interface and an event listener.
 * @author Java Foundations
 */
public class PushCounter
{
   /** Creates and displays the main program frame.
    * @param args unused
    */
   public static void main(String[] args)
   {
	  //create the top-level frame to hold the GUI
	  //and coordinate with the operating system
      JFrame frame = new JFrame("Push Counter");
      //specify what the GUI should do when the close button
      //is pressed - chance to save info before exiting
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //create the top-level panel to hold all content
      PushCounterPanel panel = new PushCounterPanel();
      //add the panel to the frame
      frame.getContentPane().add(panel);

      //prepare the GUI for display and make it visible
      frame.pack();
      frame.setVisible(true);
   }
}
