import java.awt.*;

public class Q1 extends Frame {

	public Q1() {
		super("Hello World!");
		this.setLayout(new FlowLayout());
		
		Label a = new Label("Hello World");
		this.add(a);
		
		this.pack();
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Q1();

	}

}
