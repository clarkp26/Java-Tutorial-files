import java.util.Scanner;


public class Exercise2 {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int largest = 0;
		
		while(x!=-1){
			if (x >= largest){
				largest = x;
				x = in.nextInt();
			}
			else{
				x = in.nextInt();
			}
		}
		System.out.println(largest);

	}

}
