
public class IntegerK extends Number {

	
	
	public IntegerK(Number[] l){
		super(l);
	}
	
	public int rms(Integer[] x){
		double c = 0;
		for (int i=0;i<x.length;i++){
			
			c = c + (x[i]*x[i]);
		}
		
		int a = (int) Math.sqrt(c);
		return a;
	}
	
	public double doubleValue(){
		
		return ;
	}
	
	public static void main(String[] args) {
		Integer[] b = {1,2,3,4,5};
		

	}

	@Override
	public double DoubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int rms() {
		// TODO Auto-generated method stub
		return 0;
	}



}
