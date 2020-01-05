
public class Pair<T,U> {
	private T x;
	private U y;

	public Pair(T xx,U yy){
		x=xx;
		y=yy;
	}
	
	public String toString(){
		return x +" " + y;
	}
	
	public static void main(String[] args) {
		Pair<String,Integer> phonenumber = new Pair<>("Bill's Number: ",1234);
		System.out.println(phonenumber.toString());
		Pair<Double,Double> point = new Pair<>(3.14,2.32);
		System.out.println(point.toString());

	}

}
