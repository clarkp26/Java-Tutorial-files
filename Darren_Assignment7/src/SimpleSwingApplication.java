

import javax.swing.*;

import java.awt.Image;
import java.awt.event.*;
import java.net.URL;

@SuppressWarnings("serial")
public class SimpleSwingApplication extends JFrame implements ActionListener {

        private JButton button1, button2;
        private JTextField status;
        
        public SimpleSwingApplication() {
          // call the parent class constructor - sets the frame title
          super("Simple Swing Example");

          URL iconLocation = this.getClass().getResource("dog.gif"); 
         System.out.println("Icon is at: " + iconLocation);
         ImageIcon icon = new ImageIcon(iconLocation);
         Image image = icon.getImage(); // transform it 
         Image newimg = image.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
         icon = new ImageIcon(newimg);
          
          this.status = new JTextField(20);
          this.button1 = new JButton("Button 1",icon);
          this.button2 = new JButton("Button 2",icon);

          this.button1.addActionListener(this);
          this.button2.addActionListener(this);

          // default layout is border layout for Frame/JFrame
          this.getContentPane().add("North",this.status);
          this.getContentPane().add("Center",this.button1);
          this.getContentPane().add("South",this.button2);

          this.pack();
          this.setVisible(true);
        }
        
        public void actionPerformed(ActionEvent e) {
          if (e.getActionCommand().equals("Button 1")) {
            this.status.setText("Button 1 Pressed");
          }
          else if (e.getActionCommand().equals("Button 2")) {
            status.setText("Button 2 Pressed");
          }
        }

        public static void main(String args[]) {
           new SimpleSwingApplication();
        }
}