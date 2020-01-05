import javax.swing.*;
import java.awt.*;

public class DisplayApp extends JFrame {

	private JTextArea textarea;
	
	DisplayApp(){
		super();
		this.setLayout(new FlowLayout());
		textarea = new JTextArea("",10, 30);
		textarea.setEditable(true);
		this.add(textarea);
		this.pack();
		this.setVisible(true);
	}
	DisplayApp(Color fore, Color back){
		this();
		textarea.setForeground(fore);
		textarea.setBackground(back);
	}
	
	public void print(String a) {
		String s = textarea.getText();
		if(s.equals("")) {
			textarea.setText(a);
		}
		else {
		String ans = s + "\n" + a;
		textarea.setText(ans);
		}
	}
	public void println(String a) {
		String s = textarea.getText();
		String ans = s + a;
		textarea.setText(ans);
	}
	public void println(double a) {
		String s = textarea.getText();
		String ans = s + a+ "\n";
		textarea.setText(ans);
	}
	public static void main(String[] args) {
		DisplayApp display = new DisplayApp(Color.WHITE,Color.BLACK);
	      display.print("Hello ");
	      display.println("World!");
	      display.print("A double value : ");
	      display.println(1.2345);
	      display.println("An int value : " + 123);
	      
//	      display = new DisplayApp(Color.BLUE);
//	      display.print("Is James Well?");
//	      display.print("Calculating....");
//	     display.print("Answer: no... no he is not");

	}

}
