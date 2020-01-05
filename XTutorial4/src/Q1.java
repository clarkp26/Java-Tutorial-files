
public class Q1 {
private String[] names;

public Q1(String[] x) {
	names = x;
}

public void display() {
	for(int i=0;i<names.length;i++) {
	System.out.println("Hello " + names[i]);
	}
}
	public static void main(String[] args) {
		String[] x = {"Helen","Steve","Phil","Dave"};
        Q1 one = new Q1(x);
        one.display();

	}

}
