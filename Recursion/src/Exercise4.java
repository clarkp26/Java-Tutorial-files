
public class Exercise4 {

	//private static String a;
	
	public static String WriteNum(int n){
		if(n/1000==0){
			return "\n";
		}
		else{
			int y = n%1000;
			String s = Integer.toString(y);
			String ans = "," + s;
			if ((n/1000)<1000){
				String x = Integer.toString((n/1000));
				ans = x+ans;
			}
			return WriteNum(n/1000)+ ans;
		}
		
			
		}
	
	
	public static void main(String[] args) {
		System.out.println(WriteNum(1905671234));

	}

}
