
public class Test1 implements Printable {

	public static void main(String[] args) {

		Printable[] x = new Printable[2];
		x[0] = new Test2() {
			public void print() {
				System.out.println("Yeeeoooo");
			}
		};
		x[1] = new Test2() {
			public void print() {
				System.out.println("Wooooooooo");
			}
		};
		
		for (int i=0;i<2;i++) {
			x[i].print();
		}

	}

	public void print() {
		System.out.println("Well Lad");
	}

}
