import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class RectangleComponent extends JComponent implements MouseListener {

	private int width,height;
	private Color color;
	
	RectangleComponent(int h,int w,Color c){
		height = h;
		width = w;
		color = c;
		//Question 2
		this.addMouseListener(this);
	}
	public void paintComponent(Graphics g) {
		g.setColor(color);
		
		g.fillRect(1 ,1,height,width);
		g.setColor(Color.BLACK);
	}

	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("Rectangle Component");
//		frame.setLayout(new GridLayout(20,20));
		RectangleComponent rcomp = new RectangleComponent(20,20,Color.WHITE);
		RectangleComponent rcomp1 = new RectangleComponent(20,20,Color.WHITE);
		frame.add(rcomp);
		frame.add(rcomp1);
		
//		Question 1 and 2
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
			repaint();		
		}
		else if(color.equals(Color.BLACK)){
			color = Color.WHITE;
			repaint();
	}
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
