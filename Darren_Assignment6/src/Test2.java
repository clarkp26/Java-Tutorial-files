
public class Test2 implements Printable{

	public static void main(String[] args) {
		Printable[] x = new Printable[2];
		x[0] = new Test2() {
			public void print() {
				System.out.println("One");
			}
		};
		x[1] = new Test2() {
			public void print() {
				System.out.println("Two");
			}
		};
		
		for (int i=0;i<2;i++) {
			x[i].print();
		}

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
