import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class ColorObject{
	private Color c;
	private String Name;
	
	ColorObject(Color cc,String n){
		c= cc;
		Name = n;
	}

	public Color getC() {
		return c;
	}

	public void setC(Color c) {
		this.c = c;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
}

public class SwingExercise extends JFrame implements ActionListener {

	private JButton Clear;
	private JCheckBox ReadOnly;
	private JComboBox<ColorObject> Colors;
	private JTextArea Block;
	private JLabel re,co;
	private JTextField bottom;
	private JPanel top;
	
	
	public SwingExercise() {
		ColorObject[] colors = {new ColorObject(Color.blue,"Blue"),new ColorObject(Color.black,"Black")
				,new ColorObject(Color.yellow,"Yellow"),new ColorObject(Color.red,"Red")};
		
		this.Clear = new JButton("Clear Text");
//		this.re = new JLabel("Read-Only");
		this.co = new JLabel("Text Color:");
		this.ReadOnly = new JCheckBox("Read-Only");
		this.Colors = new JComboBox<ColorObject>(colors);
		this.Block = new JTextArea("Initial Text Written",10,30);
		this.bottom = new JTextField(20);
		this.top = new JPanel();
		
		this.Clear.addActionListener(this);
		this.ReadOnly.addActionListener(this);
		this.Colors.addActionListener(this);
		
//		this.setLayout(new 
		top.add("North",this.Clear);
		top.add("North",this.ReadOnly);
//		top.add("North",this.re);
		top.add("North",this.co);
		top.add("North",this.Colors);
		this.getContentPane().add("North", top);
		
		this.getContentPane().add("Center",this.Block);
		
		this.getContentPane().add("South",this.bottom);
		
		this.pack();
		this.setVisible(true);
		
		
		
		
	}
	public static void main(String[] args) {
		new SwingExercise();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Clear Text")) {
			this.Block.setText("");
			this.bottom.setText("Text Area Cleared");
		}
		else if (e.getActionCommand().equals("Read-Only")) {
			this.Block.setEditable(false);
			this.bottom.setText("Can no longer write in TextArea");
		}
		else if (e.getSource().equals(Colors)) {
			ColorObject x = (ColorObject) Colors.getSelectedItem();
//			this.Colors.set
			this.Block.setForeground(x.getC());
			this.bottom.setText("Text has changed color to - " + x.getName());
		}
		
	}

}
