import java.awt.*;
import java.awt.event.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class Question4Resit2016 extends JFrame implements ActionListener {
	
	private JTextArea area;
	private JLabel top, countLabel;
	private JButton button;
	private JTextField tf;
	
	public Question4Resit2016() {
		super("Question 4 Text Reversal Application");
		//North Panel
		JPanel northPanel = new JPanel(new FlowLayout());
		this.top = new JLabel("Question 4 Text Reversal:");
		northPanel.add(top);
		
		//Center Panel
		JPanel centerPanel = new JPanel();
		this.area = new JTextArea(7, 70);
		JScrollPane scroll = new JScrollPane(this.area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		centerPanel.add(scroll);
		
		//South Panel
		JPanel southPanel = new JPanel(new FlowLayout());
		this.countLabel = new JLabel("Word Count:");
		this.tf = new JTextField(5);
		this.button = new JButton("Text Reversal");
		button.addActionListener(this);
		southPanel.add(button);
		southPanel.add(countLabel);
		southPanel.add(tf);
		
		this.getContentPane().add("North", northPanel);
		this.getContentPane().add("Center", centerPanel);
		this.getContentPane().add("South", southPanel);
		this.setVisible(true);
		this.pack();
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(button)) {
			int count = 0;
			String sentence = area.getText();
			String output = "";
			StringTokenizer st = new StringTokenizer(sentence);
			while(st.hasMoreTokens()){
				count++;
				output += (reverseString(st.nextToken())) + " ";
			}
			this.area.setText(output);
			this.tf.setText(Integer.toString(count));
		}
		
	}
	
	public String reverseString(String s) {
		int size = s.length();
		char result[] = s.toCharArray();
		for(int i = 0; i < size; i++) {
			result[i] = s.charAt(size-1-i);
		}
		return new String(result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Question4Resit2016();
	}
}

