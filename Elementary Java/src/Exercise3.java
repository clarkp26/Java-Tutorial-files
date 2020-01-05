import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Exercise3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("C:\\Users\\Philip\\OneDrive\\Documents\\New folder\\numbers.txt"));
		int x = in.nextInt();
		int largest = 0;
		while (x != -1){
			if (x > largest){
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
