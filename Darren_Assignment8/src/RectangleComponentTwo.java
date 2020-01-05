
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class RectangleComponentTwo extends JComponent implements MouseListener {

	private Color color;
	
	RectangleComponentTwo(Color c){
		color = c;

	}
	public void paintComponent(Graphics g) {
		for (int i=0; i<20; i++) {
		   for (int j=0; j<20; j++) {
		       g.setColor(Color.BLACK);
		       g.fillRect(20*i+1,20*j+1,20,20);
		}
		}
		for (int k =0;k<21;k++) {
			g.setColor(Color.WHITE);
			g.drawLine(0, 20*k, 20*20, 20*k);
			g.drawLine(20*k, 0, 20*k, 20*20);
		}
//		g.drawLine(0, 20, 20*20, 20);
		}
	public static void main(String[] args) {
		JFrame frame = new JFrame("Rectangle Component");
//		frame.setLayout(new FlowLayout());
		RectangleComponentTwo rcomp = new RectangleComponentTwo(Color.BLACK);
		frame.add(rcomp);
		
//		Question 1 and 2
		frame.setSize(450,450);
//		Question 3
//		frame.pack();
		frame.setVisible(true);

	}
	@Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	//Question 2
	public void mousePressed(MouseEvent e) {
		if(color.equals(Color.WHITE)) {
			color = Color.BLACK;
			this.repaint();		
		}
		else if(color.equals(Color.BLACK)){
			color = Color.WHITE;
			this.repaint();
	}
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
