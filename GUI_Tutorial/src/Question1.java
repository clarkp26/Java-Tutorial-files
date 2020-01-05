import java.awt.*;

public class Question1 extends Frame {

	public Question1(){   //constructor
	super("Yeeeeeooooowww");

    this.setLayout(new FlowLayout());
	
	Button b = new Button("Test");
	this.add(b);
	
	TextField a = new TextField("Write in here lad");
	this.add(a);
    
    Label x = new Label("Ack Weeeelll");
    this.add("Center",x);
	
//    this.setSize(300,200);
    this.pack();
	this.setVisible(true);
	}
	public static void main(String[] args) {
    
		new Question1();
	}

}
