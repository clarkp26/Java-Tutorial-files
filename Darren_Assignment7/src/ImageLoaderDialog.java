import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JTextField;

public class ImageLoaderDialog extends JDialog implements ActionListener{

	private JTextField x;
	private ImageLoader ImgLoader;
	
	ImageLoaderDialog(Frame frame, String title, ImageLoader ImgLoader, boolean isModal){
		super(frame, title, isModal);
		this.ImgLoader = ImgLoader;
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
