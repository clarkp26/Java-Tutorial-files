import java.util.Scanner;


public class Period {

	private int start, finish;
	
	public Period(int s, int f){
		start = s;
		finish = f;
	}
	public Period(){}
	
	public void get(){
		Scanner in = new Scanner(System.in);
		System.out.print("Starting Time: ");
		start = in.nextInt();
		System.out.print("Finishing Time: ");
		finish = in.nextInt();
	}
	
	public boolean Overlaps(){
		if (start>finish || finish < start){
			return false;
		}
		else {
			return true;
		}
	}
	public static void main(String[] args) {
		Period t= new Period();
		t.get();
		System.out.println("Do the times overlap: " + t.Overlaps());

	}

}
