
public class Q2 {
public String twoString(String x) {
	String[] letters= x.split("");
	if (letters.length<2) {
		return x;
	}
	return letters[0]+letters[1];
}
	public static void main(String[] args) {

		Q2 v = new Q2();
		String a = "Hello";
		String b = "H";
		System.out.println(v.twoString(a));
		System.out.println(v.twoString(b));

	}

}
