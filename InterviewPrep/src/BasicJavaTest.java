import java.util.Scanner;

public class BasicJavaTest {

	public static void EvenOdd(String s) {
		String[] Arr = s.split("");
		String ans = "";
		String ans2 = "";
		for (int i=0;i<Arr.length;i++) {
			if(i%2 != 0) {
				ans = ans + Arr[i];
			}
			else {
				ans2 = ans2+ Arr[i];
			}
		}
		System.out.println(ans2 + " " + ans);
	}
	public static String BinaryChange(int n) {
		double base = 2;
		double power = 0;
		String ans = "";
		while(true) {
			if (n/(Math.pow(base, power)) >= 1) {
				power++;
			}
			else {
				break;
			}
		}
		for(int i=(int) power-1; i>=0;i--) {
			if(n/Math.pow(base, i) >= 1.0){
				ans = ans + "1";
				n = (int) (n - Math.pow(base, i));
			}
			else {
				ans = ans + "0";
			}		
		}
		return ans;
	}
	public static void countOnes(String x) {
		int tmp = 0;
		int pos = 0;
		int count = 0;
		String[] digits = x.split("");
		while (pos < x.length()) {
			if(digits[pos].equals("1")) {
				while(digits[pos].equals("1") ) {
					tmp++;
				    System.out.println("First if");
				    pos++;
				    if(pos == x.length()) {
				    	break;
				    }
				}	
			}
			else {
				System.out.println("Second if");
				pos++;
			}
			if(tmp > count) {
				count = tmp;
			}
			tmp=0;
		
		}
		System.out.println(count);
	}
	
	public static int power(int x,int y) throws Exception{
	    int ans =0;
		if(x < 0 || y < 0){
	        System.out.println("n and p should be non-negative");
	        throw new Exception();
	    }
	    else{
	        ans = (int) Math.pow(x,y);
	    }
	    return ans;
	}
	public static void main(String[] args) throws Exception {
//		Scanner in= new Scanner(System.in);
//        int n = in.nextInt();
//		String one = "Hacker";
//		String two = "Rank";
//	
//		EvenOdd(one);
//		EvenOdd(two);
		
//		String x = BinaryChange(439);
//		System.out.println(x);
//		countOnes(x);
		
		power(3,5);
	}

}