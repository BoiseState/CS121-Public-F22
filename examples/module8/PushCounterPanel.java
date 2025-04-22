import java.awt.Color;
import java.awt.Dimension;
//import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Demonstrates a graphical user interface and an event listener.
 * 
 * @author Java Foundations
 */
@SuppressWarnings("serial")
public class PushCounterPanel extends JPanel {
   private int count;
   private JButton push;
   private JLabel label;

   /** Constructor: Sets up the GUI. */
   public PushCounterPanel() {
      count = 0;

      push = new JButton("Push Me!");
      push.addActionListener(new ButtonListener());

      label = new JLabel("Pushes: " + count);

      this.add(push);
      this.add(label);

      Color lightGreen = new Color(206, 255, 199);
      this.setBackground(lightGreen);

      this.setPreferredSize(new Dimension(600, 40));
   }

   /** Represents a listener for button push (action) events. */
   private class ButtonListener implements ActionListener {
      /** Updates the counter and label when the button is pushed. */
      public void actionPerformed(ActionEvent event) {
         // System.out.println(event.toString());
         count++;
         label.setText("Pushes: " + count);
         if (push.getText().equals("Push")) {
            push.setText("Ow!");
         } else {
            push.setText("Push");
         }
         // push.setEnabled(false);
      }
   }
}