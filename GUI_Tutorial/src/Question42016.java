import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class Question42016 extends JFrame implements ActionListener, WindowListener{
	private JLabel[] letters = new JLabel[26];
	private int[] atoz = new int[26];
	private JTextField[] counts = new JTextField[26];
	private JButton LetterCount;
	private JTextArea textArea;
	
	public Question42016(){
		super("Question 4 2016");
		Panel left = new Panel(new BorderLayout());
		Panel right = new Panel(new GridLayout(0,6));
		
		textArea = new JTextArea("yeeeooooooo",20,60);
		JScrollPane p = new JScrollPane(this.textArea,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		left.add(p);
		
		for (int i=0; i<26;i++){
//			letters[i] = new JLabel("a"+i);
//			right.add(letters[i]);
			counts[i] = new JTextField(3);
			right.add(counts[i]);
			if (i<26){
				char letter = (char)('a'+i);
				right.add(new JLabel(""+letter));
			}
		}
		
		LetterCount = new JButton("Letter Count");
		
		this.add("South",LetterCount);
		
		this.LetterCount.addActionListener(this);
		
//		((RootPaneContainer) right).getContentPane().add("West",right1);
//		((RootPaneContainer) right).getContentPane().add("East",right2);
//		
		this.getContentPane().add("West",left);
		this.getContentPane().add("East",right);
		
		this.pack();
		this.setVisible(true);
		
	}


	public static void main(String[] args) {
		new Question42016();

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Letter Count")){
            for (int i=0;i<atoz.length;i++){
				atoz[i] = 0;
			}
			String s = textArea.getText();
			for (int x=0; x<s.length(); x++){
				 char c = s.charAt(x);
				 if (c>='a' && c<='z'){
					 atoz[c-'a']++;
				 }
				 else atoz[26]++; // it is categorised as other
				 } 
			for (int i=0; i<27; i++){
				 counts[i].setText(""+atoz[i]);
			 } 
			
			System.out.println("yoooooooo");
		}
		
	}


	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
		
	}


	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	public void windowDeiconified(WindowEvent arg0) {
		for (int i=0;i<27;i++){
			 this.counts[i].setText("");
			 } 
		
	}


	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
