import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Factorial extends JFrame implements ActionListener {

	private JLabel one;
	private JTextField text_one, text_two;
	private JButton button;
	
	Factorial(){
		super("Factorial Calculator");
		this.setLayout(new FlowLayout());
		
		one = new JLabel("N:");
		text_one = new JTextField(10);
		button = new JButton("Calculate Factorial N");
		text_two = new JTextField(20);
		
		button.addActionListener(this);
		
		this.add(one);
		this.add(text_one);
		this.add(button);
		this.add(text_two);
		
		this.pack();
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Factorial();
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Calculate Factorial N")) {
			String x= text_one.getText();
			int y = Integer.parseInt(x);
			int ans= y;
			while(y!=1) {
				ans = ans*(y-1);
				y--;
			}
			String ansString = ""+ans;
			text_two.setText(ansString);
		}
	}

}
