
public class Q5 {
	

	public int CountX(String a) {
		int counter =0;
		if(a.startsWith("x")) {
			counter++;
		}
		if(a.length() > 1) {
		String x = a.substring(1);
		return counter + CountX(x);
		}
		return counter;
	}
	public static void main(String[] args) {
		Q5 c = new Q5();
		System.out.println(c.CountX("xxhixx"));
		System.out.println(c.CountX("hixx"));
		System.out.println(c.CountX("hi"));


	}

}
