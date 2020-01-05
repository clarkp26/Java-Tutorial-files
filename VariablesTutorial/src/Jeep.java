
public class Jeep extends Car{
	private boolean FourWheelDrive;
	
	public Jeep(String c, String t, int y, boolean f) {
		super(c,t,y);
		FourWheelDrive = f;
	}
	public void display() {
		super.display();
		System.out.println("Is there four wheel drive: " + FourWheelDrive);
	}
}