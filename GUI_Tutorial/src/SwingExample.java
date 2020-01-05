import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class CustomColor {
	private Color c;
	private String name;
	
	public CustomColor(Color cc,String n){
		c = cc;
		name = n;
	}
	public String getName(){return name;}
	public Color getColor() {return c;}
}

//@SuppressWarnings("serial")
public class SwingExample extends JFrame implements ActionListener{
	private JTextArea t;
	private JButton b;
	private JCheckBox c;
	@SuppressWarnings("rawtypes")
	private JComboBox<CustomColor> cb;
	private JTextField tt;
	private JLabel color;
	
	public SwingExample() {
    super("Swing Example for the Lads");
    Panel top = new Panel();
    Panel mid = new Panel();
    Panel bottom = new Panel();
    
    CustomColor[] items = {new CustomColor(Color.black,"Black"),
    		new CustomColor(Color.blue,"Blue"),
    new CustomColor(Color.red,"Red"),
    new CustomColor(Color.green,"Green")};
    
    
    b = new JButton("Clear Text");
    c = new JCheckBox("Read-Only");
    cb = new JComboBox<CustomColor>(items);
    t = new JTextArea("yeeeeeeoooooo",20,40);
    tt = new JTextField("Color of text displayed");
    color = new JLabel("Text Color: ");
    
    this.b.addActionListener(this);
    this.c.addActionListener(this);
    this.cb.addActionListener(this);
    
    top.add(b);
    top.add(c);
    top.add(color);
    top.add(cb);
    mid.add(t);
    bottom.add(tt);
    
	  JScrollPane p = new JScrollPane(this.t,
			JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	  this.t.setWrapStyleWord(true);
    
    this.getContentPane().add("North",top);
    this.getContentPane().add("Center",p);
    this.getContentPane().add("South",bottom);
    
    this.t.setEditable(false);
    this.pack();
    this.setVisible(true);

}
	public static void main(String[] args) {
		new SwingExample();

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Clear Text")){
			this.t.setText("");
			this.updateStatus("Text Area cleared");
			System.out.println("yeeeooo");
		}
		else if (e.getActionCommand().equals("Read-Only")){
			this.t.setEditable(true);
			this.updateStatus("Text Area can now be edited");
		}
		else if (e.getSource().equals(cb)){
			CustomColor selection = (CustomColor) this.cb.getSelectedItem();
		    this.t.setForeground(selection.getColor());
		    this.updateStatus("Text Color changed");
		}
		
	}
	public void updateStatus(String x){
		this.tt.setText(x);
	}

}
