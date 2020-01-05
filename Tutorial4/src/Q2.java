
public class Q2 {

	public static String TwoString(String x){
		String letters[] = x.split("");
		if (letters.length<=1){
			return "X";
		}
		return letters[0]+letters[1];
	}
	public static void main(String[] args) {
		System.out.println(TwoString("Hello"));
		System.out.println(TwoString("H"));

	}

}
