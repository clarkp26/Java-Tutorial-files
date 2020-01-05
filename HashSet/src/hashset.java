//import java.awt.List;
import java.util.*;

public class hashset{ /*implements Iterable<T> { 

	private LinkedSet<T>[] hashTable; // hash table

	HashSet() { // create the empty set
		hashTable = (LinkedSet<T>[])(new LinkedSet[1000]); 
											      // note coding trick!		
		for (int i=0; i<hashTable.length; i++)
			hashTable[i] = new LinkedSet<T>();		
	}

	private int hash(T t) { // hash t into hashTable index
		return Math.abs(t.hashCode()%hashTable.length);
	}

	int size() { 	
		int numItems = 0;
		for (LinkedSet<T> miniSet: hashTable)
			numItems = numItems+miniSet.size();
		return numItems;
	}

	boolean contains(T t) { 
		return hashTable[hash(t)].contains(t);
	}

	boolean add(T t) { 
		return hashTable[hash(t)].add(t);
	} 
       
	boolean remove(T t) {
		return hashTable[hash(t)].remove(t);
	}
	public Iterator<T> iterator() { 
		ArrayList<T> items = new ArrayList<T>();
		for (LinkedSet<T> ls: hashTable)
			for (T t: ls) 
				items.add(t);
	
		return items.iterator();
			
		}*/
public static int countUnique(String n){
	Set<String> words= new HashSet<String>();
	String[] k = n.split(" ");
	for(String c: k){
		words.add(c);
	}
	return words.size();
}
	public static void main(String[] args) {
		String[] s = {"A","B","G","P","K"};
		int[] k = {21,34,72,65,90};
		List<String> list = Arrays.asList(s);
		//System.out.printf("%s",list);
		Set<String> x = new HashSet<String>(list);
		System.out.printf("%s",x);
		String v= "Hello world all is world";
		System.out.println(countUnique(v));
		/*x.add(1);
		x.add(34);
		x.add(32);
		x.add(28);
		x.add(16);*/
		
		/*for(int k: x){
		System.out.println(k);
		}*/
	}

}
