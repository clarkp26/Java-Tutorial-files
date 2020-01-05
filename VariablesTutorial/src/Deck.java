
public class Deck {
private Cards[] deck =new Cards[52];
private int[] test;

public Deck() {}

public boolean testadd(int a) {
	for (int i=0;i<52;i++) {
		if (test[i] == null) {
			test[i] = a;
			return true;
		}
	}
	return true;
}
public void display() {
	for(int i=0;i<test.length;i++) {
		System.out.println(test[i]);
	}
}
	public static void main(String[] args) {
		Deck one = new Deck();
		one.testadd(1);
		one.testadd(2);
		one.testadd(3);
		
		one.display();


	}

}
