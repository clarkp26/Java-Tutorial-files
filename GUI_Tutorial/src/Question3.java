import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question3 extends Frame implements ActionListener{

	private TextField A,B,AB;
	private Button Multiply;
	private Label AA,BB,ABB;
	
	public Question3(){   //constructor
	super("Multiplying");

    this.setLayout(new FlowLayout());
	A = new TextField(5);
	B = new TextField(5);
	AB = new TextField(5);
	AB.setEditable(false);
	AA = new Label("A:");
	BB = new Label("B:");
	ABB = new Label("A*B=:");
	Multiply = new Button("Multiply A and B");
	this.add(Multiply);
	this.add(AA);
	this.add(A);
	this.add(BB);
	this.add(B);
	this.add(ABB);
	this.add(AB);
	
	
	this.Multiply.addActionListener(this);
//    
//    Label x = new Label("Ack Weeeelll");
//    this.add("Center",x);
	
//    this.setSize(300,200);
    this.pack();
	this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
//		int input = A.getText();
		String first = A.getText();
		String second = B.getText();
		int a = (new Integer(first)).intValue();
		int b = (new Integer(second)).intValue();
		if (e.getActionCommand().equals("Multiply A and B")){
			int product = a*b;
			AB.setText(""+product);
//			System.out.println("yeeeeeooo");
		}
	}
	public static void main(String[] args) {
    
		new Question3();
	}

}
