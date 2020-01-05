import java.util.*;
import java.util.Map.Entry;

public class LeagueTeams<T,U> /*implements Comparable<T> */{
	
	public static void main(String[] args) {
		HashMap<String,Integer> x = new HashMap();
		/*x.put("Rovers", 25);
		x.put("United", 23);
		x.put("City", 27);
		x.put("Town", 28);*/
		for(int i=0;i<4;i++){
		Scanner in = new Scanner(System.in);
		System.out.print("Team: ");
		String q = in.nextLine();
		System.out.print("Points: ");
		int w = in.nextInt();
		x.put(q,w);
		}
		
		for (Entry<String,Integer> entry:x.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		TreeMap<String,Integer> k = new TreeMap(x);
		System.out.println("\n");
		
		for (Entry<String,Integer> entry:k.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		}

	}


