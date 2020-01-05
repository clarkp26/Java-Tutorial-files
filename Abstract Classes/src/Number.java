
public abstract class Number {

    private Number[] number;
	
	public Number(Number[] n){
		number =n;
	}
	
	public abstract double DoubleValue();
	
	/*public abstract int IntValue();*/
	
	public abstract int rms();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
