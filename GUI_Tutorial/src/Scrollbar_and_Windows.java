import java.awt.*;
import java.awt.event.*;

public class Scrollbar_and_Windows extends Frame implements ActionListener,AdjustmentListener,WindowListener{

	private TextField name1,name2,name3,storedName;
	private Button Store;
	private Scrollbar scrollbar;

	
	public Scrollbar_and_Windows(){   //constructor
	super("DCU Student Records Browser");
	this.setLayout(new GridLayout(2,1));
	Panel topLine = new Panel();
	
	name1 = new TextField("first name",10);
	name2 = new TextField("Second name",10);
	name3 = new TextField("third name",10);
	storedName = new TextField("Stored",15);
	Store = new Button("Store");
	scrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 20, 5, 0, 1100);
	topLine.add(name1);
	topLine.add(name2);
	topLine.add(name3);
	topLine.add(storedName);
	topLine.add(Store);
	
	this.add(topLine);
	this.add(scrollbar);
	
	
	this.Store.addActionListener(this);
	this.scrollbar.addAdjustmentListener(this);

	this.updateText();
    this.pack();
//    topLine.setVisible(true);
	this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		
		if (e.getActionCommand().equals("Store")){

			this.scrollbar.setValue(50);
			this.scrollbar.setValue(60);
			this.scrollbar.setValue(1200);
			System.out.println("yeeeeeooo");
		}
	}
   private void updateText(){
        storedName.setText("Scroll Value = " + scrollbar.getValue());
}


	
	public static void main(String[] args) {
    
		new Scrollbar_and_Windows();
	}
	public void windowActivated(WindowEvent arg0) {
		this.scrollbar.setValue(50);
        this.updateText();
		
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
		// TODO Auto-generated method stub
		
	}
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void adjustmentValueChanged(AdjustmentEvent e) {
		if (e.getSource().equals(scrollbar)){
            this.updateText();
		}
		
	}

}
