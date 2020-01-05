
public class Methods {

	Methods(){}
	//Question 1
	static String reverse(String str) {
		String[] s = str.split("");
		String ans = "";
		for(int i=str.length()-1;i>=0;i--) {
			ans += s[i];
		}
		return ans;
	}
	
	//Question 2
	static double[] randomArray(int N) {
//		double[] ans = new double[N];
//		double counter = 0;
//		for(int i=0;i<N;i++) {
//			counter = counter + 1.0/N; //has to be 1.0 not 1
//			ans[i] = counter;
//
//		}
//		return ans;	
		double[] ans = new double[N];
		for(int i=0;i<N;i++) {
			ans[i] = (Math.random()*1.0)+0;
		}
		return ans;
	}
	
	//Question 3
	public static int LowerCaseCount(String s) {
		if (s.length()==0) {
			return 0;
		}
		String x = s.substring(s.length()-1);
		String ss = s.replace(x,"");
		if(x != x.toUpperCase()) {
		return 1+LowerCaseCount(ss);
		}
		else return LowerCaseCount(ss);
	}
	public static void main(String[] args) {
		//Question 1
//		String s1 = "Hello world!";
//		s1 = reverse(s1);
//		System.out.println(s1);

		//Question 2
		double[] x = randomArray(7);
		for(int i=0;i<7;i++) {
			System.out.println(x[i]);
		}
		//Question 3
//		String s = "abcdefgh";
//		String character = s.substring(5);
//		System.out.println(character);
//		String x = character.toUpperCase();
//		String y = s.substring(7,5);
//		System.out.println(y);
//		System.out.println(LowerCaseCount("ABCDEcde"));

	}

}
