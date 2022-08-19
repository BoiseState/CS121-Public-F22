import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

/**
 * A mouse odometer.
 * @author amit, CS121 Instructors
 *
 */

 /* Look at MouseMotionListener API for more information on what is available */
@SuppressWarnings("serial")
public class MouseOdometerPanel extends JPanel implements MouseMotionListener
{
	/* This panel has some instance variables */
	private int sum = 0;
	private int mouseX, mouseY;

	/**
	 * Constructor
	 */
	public MouseOdometerPanel()
	{
		addMouseMotionListener(this);
	}

	public void paintComponent(Graphics g)
	{
		/* This section of code sets the visual parameters.
		 * Things to try: 
		 * 	- change the color of the graphics component "g"
		 * 	- change the rectangle so there is a different colored
		 * 		border around it (tip: use two rectangles)
		 * 	- change the font and fontSize
		 * 	- change the text that is displayed
		 */
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());
		int fontSize = getHeight()/4;
		Font myFont = new Font("Monospaced", Font.BOLD, fontSize);
		setFont(myFont);
		String temp = sum + " ";

		/* Look at the API for FontMetrics for more information */
		FontMetrics metrics = g.getFontMetrics();
		int x = (getWidth() - metrics.stringWidth(temp))/2 + metrics.getMaxAdvance()/2;
		int y = (getHeight() - metrics.getHeight())/2 + metrics.getHeight() - metrics.getDescent() - metrics.getLeading();

		/* Draws the String in the panel */
		g.setColor(Color.black);
		g.drawString(temp, x, y);
	}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent)
	 */
	public void mouseDragged(MouseEvent event) { }

	/* (non-Javadoc)
	 * @see java.awt.event.MouseMotionListener#mouseMoved(java.awt.event.MouseEvent)
	 */
	public void mouseMoved(MouseEvent event)
	{
		/* This is the meat of the "doing" in this program.  This is where the
		 * instance variable "sum" is updated and repaint() is called which updates the 
		 * text in the panel.
		 */
		int newX = event.getX();
		int newY = event.getY();

		int deltaX = newX - mouseX;
		int deltaY = newY - mouseY;
		double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
		sum = (int) distance + sum;

		mouseX = newX;
		mouseY = newY;

		repaint();
	}
	
}
