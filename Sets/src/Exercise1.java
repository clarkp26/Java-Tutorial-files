import java.util.HashSet;
import java.util.Scanner;
import java.util.Collection;


public class Exercise1 {

	
	public static void main(String[] args) {
		HashSet<Integer> w = new HashSet();
		int x=0;
		for (int i=0;i<100;i++){
			if(x!=-1){
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		
		if(w.contains(x)){
			System.out.println("Occurred Previously");	
			        }
		else {
			System.out.println("First Occurence");
		}
		w.add(x);
		
		    }
		}
		System.out.println("\n" +w);
	}

}
