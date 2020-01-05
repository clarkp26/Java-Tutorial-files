import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question2 extends Frame implements ActionListener{

	private TextField a;
	private Button UpperCase,LowerCase;
	
	public Question2(){   //constructor
	super("Yeeeeeooooowww");

    this.setLayout(new FlowLayout());
	
	UpperCase = new Button("UpperCase");
	this.add(UpperCase);
	LowerCase = new Button("LowerCase");
	this.add(LowerCase);
	
	this.UpperCase.addActionListener(this);
    this.LowerCase.addActionListener(this);
  
	
	a = new TextField(30);
	this.add(a);
//    
//    Label x = new Label("Ack Weeeelll");
//    this.add("Center",x);
	
//    this.setSize(300,200);
    this.pack();
	this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		String input = a.getText();
		if (e.getActionCommand().equals("UpperCase")){
			a.setText(input.toUpperCase());
		}
		if (e.getActionCommand().equals("LowerCase")){
			a.setText(input.toLowerCase());
		}
	}
	public static void main(String[] args) {
    
		new Question2();
	}

}
