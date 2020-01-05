import java.awt.*;
import java.awt.event.*;

public class Q4 extends Frame implements ActionListener, WindowListener{

	private Label[] labels = new Label[7];
	private TextField[] nums = new TextField[7];
	private Button draw;
	public Q4() {
		super("Lottery Numbers Draw");
		this.setLayout(new FlowLayout());
		this.addWindowListener(this);
		
		for (int i=0;i<7;i++) {
			this.labels[i] = new Label((i+1)+":");	
			this.nums[i] = new TextField("",3);
		}
		this.draw = new Button("Draw");
		
		for (int i=0;i<7;i++) {
			this.add(labels[i]);
			this.add(nums[i]);
		}
		this.add(draw);
		this.draw.addActionListener(this);
		
		this.pack();
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Q4();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int x =0;
    if(e.getActionCommand().equals("Draw")) {
    	for(int i=0;i<7;i++) {
    		if(i<5) {
    			x = (int)(Math.random()*50)+1;
    		}
    		else {
    			x = (int)(Math.random()*11)+1;
    		}
    		    nums[i].setText(""+ x);
    	}
    }
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
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
