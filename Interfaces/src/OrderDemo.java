


public class OrderDemo   {

	public void print(Object obj) {
		if (obj == new Time()){
			System.out.println("Time: " +obj);
		}
		else if (obj == new Point()){
			System.out.println("Point: "+ obj);
		}
	}
	
	public static void main(String[] args) {
		Time t = new Time();

	}



	

}
