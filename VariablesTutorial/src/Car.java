
public class Car {
protected static int CarNumber = 10000;
protected String color,type;
protected int year;

public Car(String c,String t, int y) {
	
	color = c;
	type =t;
	year =y;
	CarNumber++;
}

public void display() {
	System.out.println("Color: " + color +"\nType: "+ type + "\nYear: " + year + "\nCar Number: "+ CarNumber);
}

	public static void main(String[] args) {
//		Car one = new Car("Blue","Honda",2009);
//		one.display();
//		Jeep two = new Jeep("Red","Toyota",2011,true);
//		two.display();
		int i = 10;
		int n = i++%5;
		boolean x = true;
		boolean y = !x;
		System.out.println(y);
		System.out.println(i);
		i = y ? 1 : 7;
		System.out.println(i);



	}

}

