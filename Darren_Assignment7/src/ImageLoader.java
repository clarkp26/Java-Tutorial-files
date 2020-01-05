import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;

public class ImageLoader extends JFrame implements ActionListener{

	private JButton LoadImg, CloseImg;
	
	ImageLoader(){
		super("Image Loader Application");
		this.setLayout(new FlowLayout());
		
		LoadImg= new JButton("Load Image");
		LoadImg.addActionListener(this);
		CloseImg= new JButton("Close Image");
		CloseImg.addActionListener(this);
		
		this.add(LoadImg);
		this.add(CloseImg);
		
		this.setSize(400,400);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new ImageLoader();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
