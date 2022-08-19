import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;


/**
  A simple demo of a JFrame and how to listen for window events.
  @author amit, CS121 Instructors
 */

 /*
  * Notice this class extends JFrame meaning SimpleFrame1 is-a 
  JFrame.  The class implements WindowListener meaning WindowListener
  is an interface.
  */
@SuppressWarnings("serial")
public class SimpleFrame1 extends JFrame implements WindowListener
{
	public SimpleFrame1()
	{
		/*
		 * Try changing the text in the super() method and run the 
		 * program again.  What happens?
		 * 
		 * addWindowListener() allows a method to be called when
		 * a window event occurs.
		 * 
		 * Try changing setSize to see what happens to the window 
		 */
		super("Frame Demonstration");
		addWindowListener(this);
		setSize(300, 300);
	}

	public void windowClosing (WindowEvent event) 
	{
		/* This method is invoked when the window closes.
		 * Try adding a System.out.println() statement here.
		 */
		System.exit(0);

	}

	public void windowActivated (WindowEvent event) 
	{
		/* This method is invoked when the window becomes
		 * the active window (e.g. is selected, un-minimized, etc.)
		 */
		System.out.println("Window was activated.");
	}

	public void windowDeactivated (WindowEvent event) 
	{
		/* This method is invoked when the window is no longer
		 * the active window (e.g. the window is minimized, a different
		 * window is selected, etc.)
		 */
		System.out.println("Window was de-activated.");
	}

	/* These methods are just stubs because the methods
	 * are required by the interface. Try adding simple
	 * functionality to each method.
	 */
	public void windowClosed (WindowEvent event) {}
	public void windowDeiconified (WindowEvent event) {}
	public void windowIconified (WindowEvent event) {}
	public void windowOpened (WindowEvent event) {}

}
