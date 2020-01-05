
public class TestMain {

	
	public static void main(String[] args) {

		Bag<Date> ds = new Bag<Date>();
		ds.add(new Date(12,9,1994));
		ds.add(new Date(12,9,1995));
		ds.add(new Date(12,9,1996));
		ds.add(new Date(12,9,1997));
		
		System.out.println("Number Later than today: "+ ds.compareTo(new Date(12,9,1992)));
	}

}
