
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class RectangleComponentTwoTest extends JComponent implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	private RectangleComponent rc;
	private int height, width;
	private int x_position, y_position;
//	private static int x_position =0;
//	private static int y_position =0;
	private Color color;
	
	RectangleComponentTwoTest(int h,int w ,Color c, int xp, int yp){
//		rc =x;
		height = h;
		width= w;
		color=c;
		x_position =xp;
		y_position = yp;
		
		
		//Question 2
//		this.addMouseListener(this);
	}
	public void paintComponent(Graphics g) {
//		super.paintComponent(g);

		g.setColor(color);	
		g.fillRect(x_position ,y_position ,height,width);
		System.out.println(x_position);
		System.out.println(y_position+"\n");

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Rectangle Component");
		frame.setLayout(new GridLayout(20,20,1,1));

		
        for(int j=0;j<20;j++) {
		   for(int i=0;i<20;i++) {	   
			   RectangleComponent x = 
	        		   new RectangleComponent(20,20,Color.BLACK);
	           frame.add(x);
		    }
		}
		frame.setSize(450,450);
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
