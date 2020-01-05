import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.URL;

import javax.swing.*;

public class SwingExercise extends JFrame implements ActionListener,ItemListener {

	private JButton button;
	private JCheckBox checkbox;
	private JComboBox combo;
	private JLabel label;
	private JTextArea textarea;
	private JPanel p;
	
	SwingExercise(){
		super("Swing Exercise");
		this.setLayout(new BorderLayout());
		
//		URL iconLocation = this.getClass().getResource("https://www.cesarsway.com/sites/newcesarsway/files/styles/large_article_preview/public/Common-dog-behaviors-explained.jpg?itok=FSzwbBoi"); 
//        System.out.println("Icon is at: " + iconLocation);
//        ImageIcon icon = new ImageIcon(iconLocation, "A running dog icon");
        
		
		p = new JPanel(new FlowLayout());
		button = new JButton("Clear Text");
		checkbox = new JCheckBox("Read-Only");
		label = new JLabel("Colors:");
		String s[] = {"Black","Blue","Red","Green"};
		combo = new JComboBox<String>(s);
		textarea = new JTextArea("This is the initial text",30,30);
		
		button.addActionListener(this);
		checkbox.addActionListener(this);
		combo.addItemListener(this);
		
		p.add(button);
		p.add(checkbox);
		p.add(label);
		p.add(combo);

		
		this.add(p,BorderLayout.PAGE_START);
		this.add(textarea,BorderLayout.PAGE_END);
		
		this.pack();
		this.setVisible(true);;
		
	}
	public static void main(String[] args) {
		new SwingExercise();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Clear Text")) {
			textarea.setText("");
		}
		if(e.getActionCommand().equals("Read-Only")) {
			textarea.setEditable(false);
		}
//		if(e.getSelectItem().equals("Blue")) {
//			
//		}
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getItem().equals("Blue")) {
			textarea.setForeground(Color.BLUE);
		}
		if(e.getItem().equals("Black")) {
			textarea.setForeground(Color.BLACK);
		}
		if(e.getItem().equals("Red")) {
			textarea.setForeground(Color.RED);
		}
		if(e.getItem().equals("Green")) {
			textarea.setForeground(Color.GREEN);
		}
		
	}

}
