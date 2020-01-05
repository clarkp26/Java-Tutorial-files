import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2 extends Frame implements ActionListener{

	private Button Uppercase,Lowercase;
	private TextField a;
	public Q2() {
		super();
		this.setLayout(new FlowLayout());
		
		this.a = new TextField("Enter Sentence");
		
		this.Uppercase = new Button("Uppercase");
		this.Uppercase.addActionListener(this);
		
		this.Lowercase = new Button("Lowercase");
		this.Lowercase.addActionListener(this);
		
		this.add(a);
		this.add(Uppercase);
		this.add(Lowercase);
		
		this.pack();
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Q2();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Uppercase")) {
			a.setText(a.getText().toUpperCase());
		}
		else if(e.getActionCommand().equals("Lowercase")) {
			a.setText(a.getText().toLowerCase());
		}
		
		
	}

}
