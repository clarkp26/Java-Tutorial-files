
public class Double extends Number {

	public double rms(double[] x){
		double c = 0;
		for (int i=0;i<x.length;i++){
			c = c + (x[i]*x[i]);
		}
		double a = Math.sqrt(c);
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
