import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;


public class Frequency {

	public static void main(String[] args) {
		TreeMap<Integer,Integer> x = new TreeMap();
		
		Scanner in = new Scanner(System.in);
		String g = in.nextLine();
		
		//String g = "There is no good or evil but thinking makes it so";
		String[] k = g.split(" ");
		int[] wl = new int[k.length];
		for (int i=0;i<k.length;i++){
			int p=k[i].length();
			wl[i] = p;
		}
		for( int i=0;i<wl.length;i++){
		if (!x.containsKey(wl[i])){
			x.put(wl[i],1);
		}
		else {
			x.put(wl[i], x.get(wl[i])+1);
		}
		}
		System.out.println("Word length      Frequency");
		for (Entry<Integer,Integer> entry:x.entrySet()){
			System.out.println( "    " + entry.getKey() + "                " + entry.getValue());
		}
		//System.out.println(wordLength(g));

	}

}
