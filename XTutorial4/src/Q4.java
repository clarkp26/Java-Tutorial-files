
public class Q4 {

	public static String nTwice(String x,int n) {
		String[] letters = x.split("");
		String first = "";
		String second = "";
		for (int i=0;i<n;i++) {
			first= first+letters[i];
		}
		for (int j=(x.length()-n);j<x.length();j++) {
			second = second + letters[j];
		}
		return first + second;
	}
	public static void main(String[] args) {
		System.out.println(nTwice("Hello",2));
		System.out.println(nTwice("Chocolate",1));
		System.out.println(nTwice("Chocolate",3));


	}

}
