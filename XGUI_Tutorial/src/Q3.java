import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Q3 extends Frame implements ActionListener, WindowListener{

	private Button Multiply;
	private Label A,B,AB;
	private TextField a,b,ab;
	public Q3() {
		super("Calculator");
		this.setLayout(new FlowLayout());
		this.addWindowListener(this);
		
		this.A = new Label("A:");
		this.B = new Label("B:");
		this.AB = new Label("A*B:");
		this.a= new TextField("",10);
		this.b= new TextField("",10);
		this.ab= new TextField("",10);
		this.Multiply = new Button("Calculate");
		
		this.add(A);
		this.add(a);
		this.add(B);
		this.add(b);
		this.add(AB);
		this.add(ab);
		this.add(Multiply);

		this.Multiply.addActionListener(this);
		
		this.pack();
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Q3();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String first = a.getText();
		String second = b.getText();
		int a = (new Integer(first)).intValue();
		int b = (new Integer(second)).intValue();
		if (e.getActionCommand().equals("Calculate")) {
			int product = a*b;
			ab.setText(""+product);
		}
				
		
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
//		this.a.setText("");
//		this.b.setText("");
//		this.ab.setText("");
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
		
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
