import java.util.ArrayList;
import java.util.Scanner;


public class Exercise4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int divider = 1;
		
		if (x%2 == 1){
			System.out.println("Sorry, I don't do negatives");
		}
		else{
		    while (divider <= x){
			    if (x%divider == 0){    	
			    	System.out.println(divider);	    	
			    }
			    divider++;
		}
		}
	}

}
