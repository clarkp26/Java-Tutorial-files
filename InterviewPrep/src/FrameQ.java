import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FrameQ extends JFrame implements ActionListener {

	private JTextField t,key;
	private JLabel l;
	private JButton en,de;
	
	FrameQ(){
		super("Encypter");
		
		this.setLayout(new FlowLayout());
		
		t = new JTextField(20);
		this.add(t);
		en = new JButton("Encrypt");
		en.addActionListener(this);
		this.add(en);
		de = new JButton("Decrypt");
		de.addActionListener(this);
		this.add(de);
		l = new JLabel("Key:");
		this.add(l);
		key = new JTextField(3);
		this.add(key);
		
		this.pack();
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new FrameQ();

	}
	double x =(Math.random()*0.5)+0;
	double y =(Math.random()*1)+0.5;
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Encrypt")) {
		    String x= t.getText();
		    int keyval = Integer.parseInt(key.getText());
		    char[] chars = x.toCharArray();
		    for(int i=0;i<chars.length;i++) {
		    	chars[i] = (char) (chars[i]+keyval);
		    }
		    String ans = new String(chars);
		    t.setText(ans);
		}
        if(e.getActionCommand().equals("Decrypt")) {
    	    String x= t.getText();
		    int keyval = Integer.parseInt(key.getText());
		    char[] chars = x.toCharArray();
		    for(int i=0;i<chars.length;i++) {
		    	chars[i] = (char) (chars[i]-keyval);
		    }
		    String ans = new String(chars);
		    t.setText(ans);
		}
		
	}

}
