import java.util.Scanner;
import java.util.Scanner;


	public class Period2 {

		private int start1, finish1, start2, finish2;
		
		public Period2(int s1, int f1, int s2, int f2){
			start1 = s1;
			finish1 = f1;
			start2 = s2;
			finish2= f2;
		}
		public Period2(){}
		
		public void get(){
			Scanner in = new Scanner(System.in);
			System.out.print("Starting Time: ");
			start1 = in.nextInt();
			System.out.print("Finishing Time: ");
			finish1 = in.nextInt();
			System.out.print("Starting Time 2: ");
			start2 = in.nextInt();
			System.out.print("Finishing Time 2: ");
			finish2 = in.nextInt();
		}
		
		public boolean Overlaps(){
			/*if (start1 > finish1 || finish1 < start1){
				return false;
			}
			if( start2 > finish2 || finish2 < start2){
				return false;
			}*/
			if (start1 > start2 && start1 < finish2){
				return true;
			}
			if (finish1 > start2 && finish1 < finish2){
				return true;
			}
			else {
				return false;
			}
		}
		public static void main(String[] args) {
			Period2 t= new Period2();
			t.get();
			System.out.println("Do the times overlap: " + t.Overlaps());

		}

	}

