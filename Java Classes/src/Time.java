import java.util.Scanner;


public class Time {
    private int time;
    
	public Time(int t){
		time = t;
	}
	public Time(){}
	
	public void get(){
		Scanner in = new Scanner(System.in);
		System.out.print("Please Enter The Time: ");
		time = in.nextInt();
		
	}
	
	public boolean gt(){
		int mins = time%100;
		int hours = time/100;
		
		if (mins > 59 || hours > 23){
			return false;
		}
		else {
			return true;
		}
		
	}
	public static void main(String[] args) {
		Time x = new Time();
		x.get();
		System.out.println("Is the time within the liimits: " + x.gt());
		

	}

}
