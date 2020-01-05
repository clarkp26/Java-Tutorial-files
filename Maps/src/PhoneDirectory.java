import java.util.HashMap;
import java.util.Scanner;
import java.util.*;


public class PhoneDirectory {
	
	public static void main(String[] args) {
		HashMap<String,Integer> nn= new HashMap();

		for( int i=0;i<6;i++){
		Scanner in = new Scanner(System.in);
		String x = in.nextLine();
		String[] k = x.split(" ");
		String name = k[0];
		
		if (k[1].contains("?")){
	        if(nn.containsKey(name)){
	        	
	        	System.out.println(name + " " + nn.get(name));
	        }
	        else{
	        	System.out.println("Can't find " + name);
	        } 
	     }

		else if (nn.containsKey(name)){
        	  int num = Integer.parseInt(k[1]);
			    int v = nn.get(name);
			    nn.remove(v);
			    nn.remove(name);
			    nn.put(name, num);
		}
          else{
        	  int num = Integer.parseInt(k[1]);
		nn.put(name, num);
		}
		}
		
	System.out.println(nn);

	}

}
