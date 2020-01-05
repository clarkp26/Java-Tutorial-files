import java.awt.*;

import javax.swing.*;

public class AppExample extends JFrame {

	private JButton b;
	private JTextField t;
	private JTextArea a;
	private JLabel x;
	AppExample(){
		super("App Example");
		this.setLayout(new FlowLayout());
		
		b = new JButton("Our Button");
		t = new JTextField("",10);
		a = new JTextArea("",10,10);
		x = new JLabel("This is the label");
		
		this.add(b);
		this.add(t);
		this.add(x);
		this.add(a);
//		this.setSize(10,10);
		this.pack();
		this.setVisible(true);;
	}
	public static void main(String[] args) {
		new AppExample();

	}

}
