import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Calculator extends JFrame implements ActionListener{

	private JButton one,two,three,four,five,six,seven,eight,nine,zero,plus,C;
	private JTextField t;
	private static int Plus_Count =0;
	private static int tmp =0;
	Calculator(){
		super("Calculator");
		this.setLayout(new BorderLayout());
		
		JPanel p = new JPanel();
		JPanel q = new JPanel();
		
		p.setLayout(new GridLayout(4,3,20,20));
		
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero= new JButton("0");
		plus = new JButton("+");
		C = new JButton("C");
		t = new JTextField("",10);
		Font font = new Font("TimesRoman", Font.BOLD, 30);
		t.setBackground(Color.BLACK);
		t.setForeground(Color.WHITE);
		t.setFont(font);
		
		zero.addActionListener(this);
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		plus.addActionListener(this);
		C.addActionListener(this);
		
		
		p.add(zero);
		p.add(one);
		p.add(two);
		p.add(three);
		p.add(four);
		p.add(five);
		p.add(six);
		p.add(seven);
		p.add(eight);
		p.add(nine);
		p.add(plus);
		p.add(C);
		q.add(t);
		this.add(t,BorderLayout.PAGE_START);
		this.add(p,BorderLayout.PAGE_END);

		this.setSize(270,270);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Calculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("0")) {
			if (check() == true) {
			String s = t.getText();
			t.setText(s+"0");
			}
		}
		if(e.getActionCommand().equals("1")) {
			if (check() == true) {
			String s = t.getText();
			t.setText(s+"1");
			}
		}
		if(e.getActionCommand().equals("2")) {
			if (check() == true) {
			String s = t.getText();
			t.setText(s+"2");
			}
		}
		if(e.getActionCommand().equals("3")) {
			if (check() == true) {
			String s = t.getText();
			t.setText(s+"3");
			}
		}
		if(e.getActionCommand().equals("4")) {
			if (check() == true) {
			String s = t.getText();
			t.setText(s+"4");
			}
		}
		if(e.getActionCommand().equals("5")) {
			if (check() == true) {
			String s = t.getText();
			t.setText(s+"5");
			}
		}
		if(e.getActionCommand().equals("6")) {
			if (check() == true) {
			String s = t.getText();
			t.setText(s+"6");
			}
		}
		if(e.getActionCommand().equals("7")) {
			if (check() == true) {
			String s = t.getText();
			t.setText(s+"7");
			}
		}
		if(e.getActionCommand().equals("8")) {
			if (check() == true) {
			String s = t.getText();
			t.setText(s+"8");
			}
		}
		if(e.getActionCommand().equals("9")) {
			if (check() == true) {
			String s = t.getText();
			t.setText(s+"9");
			}
		}
		if(e.getActionCommand().equals("C")) {
			t.setText("");
			tmp = 0;
			Plus_Count =0;
		}
		if(e.getActionCommand().equals("+")) {
			
			if(Plus_Count == 0) {
			tmp = Integer.parseInt(t.getText());
			t.setText("");
			Plus_Count++;
			}
			else {				
				tmp = tmp + Integer.parseInt(t.getText());
				if(tmp > (1000000000)) {
					t.setText("Number Is Too Large! Press C to Reset");
				}
				else {
					t.setText(""+tmp);
				}
			}
		}	
	}
	
	public boolean check() {
		if(t.getText().length() >=10) {
			return false;
		}
		else 
			return true;		
	}

}
