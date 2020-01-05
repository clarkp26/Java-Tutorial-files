import java.util.*;

public class Ascending {
	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<>();
		 for(int i=0;i<10;i++){
			 Scanner in = new Scanner(System.in);
			 int k = in.nextInt();
		     x.add(k);
		 }
		 Collections.sort(x);
		 
	     System.out.println(x);
		 
		 

	}

}
