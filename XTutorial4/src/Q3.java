
public class Q3 {
public static boolean hasBad(String x) {
	String y = x.substring(1);
	if (x.startsWith("bad") || y.startsWith("bad")) {
		return true;
	}
	return false;
}
	public static void main(String[] args) {
		System.out.println(hasBad("badxx"));
		System.out.println(hasBad("xbadxx"));
		System.out.println(hasBad("xxbadxx"));

	}

}
