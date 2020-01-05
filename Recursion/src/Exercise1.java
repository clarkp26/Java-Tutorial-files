
public class Exercise1 {

	public static int gcd(int m,int n){
	if (m==0){
		return n;
	}
	
	else 
		System.out.println(n%m);
		return gcd(n%m, m);
	}
	
	public static void main(String[] args) {
		//System.out.println(gcd(6,12));
        
		int y = gcd(90,105);
		System.out.println(y);
	}

}
