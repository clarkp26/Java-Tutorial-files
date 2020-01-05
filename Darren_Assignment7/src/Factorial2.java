
//import java.awt.;
//import java.awt.event.;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Factorial2 implements ActionListener{
	
	private JFrame x;
	private JTextField t;
	private JTextField t1;
	private JButton b;
	private JLabel l;
	
	public Factorial2()
	{
	x = new JFrame("Factorial Calculator");
	l = new JLabel("N");
	t = new JTextField("",2);
	b = new JButton("Calculate Factorial N");
	t1 = new JTextField("",20);
	t1.setEditable(false);
	x.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
	x.add(l);
	x.add(t);
	b.addActionListener(this);
	x.add(b);
	x.add(t1);
	x.pack();
	x.setVisible(true);
	
	
	}
	
	
	
	

	public static void main(String[] args) {
		Factorial2 x = new Factorial2();
		
	

	}





	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Calculate Factorial N")) {
			String s  = t.getText();
			int j = 0;
			
			if (s.charAt(0)== '-') {
				t1.setText("N is too Small");
			}
			
			else {
				
			   try {
					  j = Integer.parseInt(s)	;
			   }    
			   catch  (NumberFormatException d) {
			   t1.setText("Thats not an Integer");
			   return;
			   }

			    if(j>18)
			    {
				   t1.setText("N is out of range");
			    }
			    
			    else if(j<=18 && j>=1) {
			       int total = j;
			         for(int i = j-1; i>=1; i--) {
			            total = total*i;	
			         }
			       t1.setText(""+total);
			    }
		}
		
		}
		
	}

	}




