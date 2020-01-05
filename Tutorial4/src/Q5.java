
public class Q5 {

//	private int count =0;
	
	public static int CountX(String x){
		int count = 0;
		if (x.length() == 0){
			return count;
		}
		if (x.charAt(0) == 'x'){
			count++;
		}
		count = count + CountX(x.substring(1));
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(CountX("xHelloxxx"));
	
	}
}


