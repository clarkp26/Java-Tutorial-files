import java.awt.GridLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class MatrixDisplay extends JFrame {

	private JLabel[] labels;
	private JPanel k;
	
	MatrixDisplay(double[][] A){
		super("Matrix Display App");
		k = new JPanel();
		this.setLayout(new GridLayout(A.length,A[0].length,15,15));
		
		labels = new JLabel[A[0].length*A.length];

		int x = 0;
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[0].length;j++) {
				if(i==0){
					labels[j] = new JLabel(""+A[i][j]);
				}
				if(i==1){
					x=4;
					labels[j+x] = new JLabel(""+A[i][j]);
				}
				if(i==2){
					x=8;
					labels[j+x] = new JLabel(""+A[i][j]);
				}
			}
		}
		for (int i=0;i<(A[0].length*A.length);i++) {
			this.add(labels[i]);
		}
		
		this.pack();
		this.setVisible(true);
	}
	public static void main(String[] args) {
//		double a[][] = new double[3][3];
//		a[0][0] = 1;
//		a[0][1] = 2;
//		a[0][2] = 3;
//		a[1][0] = 4;
//		a[1][1] = 5;
//		a[1][2] = 6;
//		a[2][0] = 7;
//		a[2][1] = 8;
//		a[2][2] = 9;
//		System.out.println(a.length);
		double[][] A = {{1.2,2.3,4.4,3.2},{3.3,6.4,9.1,5.1},{0.3,4.2,7.3,9.6}};
//		System.out.println(A[0].length);
		new MatrixDisplay(A);
	}

}
