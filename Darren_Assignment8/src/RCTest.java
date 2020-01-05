import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class RCTest extends JComponent implements MouseListener{
	private static int width;
	private static int height;
	private Color color;
	public RCTest(int w, int h, Color c)
	{
		width = w;
		height = h;
		color = c;
		this.addMouseListener(this);
	}
	public void paintComponent(Graphics g)
	{
		g.setColor(color);
		g.fillRect(1,1,width,height);
		g.setColor(Color.BLACK);
	}

@Override
public void mouseClicked(MouseEvent e) {
	if (color.equals(Color.BLACK))
	{
		color = Color.WHITE;
		repaint();
	}
	else
	{
		color = Color.BLACK;
		repaint();
	}

}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
public static void main(String args[])
{
	JFrame frame = new JFrame("Rectangle Component");
	
	frame.setLayout(new GridLayout(20,20));
	for(int j = 0; j<20; j++) {
		RCTest x = new RCTest(400,200,Color.BLACK );
		frame.add(x);
	for(int i=0; i<20;i++) 
	{
		RCTest y = new RCTest(50,50,Color.BLACK );
		frame.add(y);
//		frame.pack();
	}
	}
	frame.setSize(450,450);
	frame.setVisible(true);

}
}