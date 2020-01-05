import java.util.*;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class ArrayList<T> implements Iterable<T> {
	
	private static class MyIterator<T> implements Iterator<T> {
		
		private T[] seq;
		private int numItems; // seq[0..numItems-1] significant
		private int current = 0; // index of current item
		
		MyIterator(T[] seq0, int numItems0) {
			seq = seq0; numItems = numItems0;
		}
			
		public boolean hasNext() {return current!=numItems;}
		
		public T next() {
			if (current==numItems)throw new NoSuchElementException();
			T t = (T)(seq[current]);
			current++;
			return t;
		}
		
		
	}

	//private ArrayList<T> List = new ArrayList<>();
	private T[] seq = (T[])(new Object[1024]); // 1024 arbitrary
	private int numItems = 0; // seq[0..numItems-1] significant
		
	public int size() {return(numItems);}
	
	public T get(int i) {
		if (i<0||i>=numItems) throw new IndexOutOfBoundsException();
		else return seq[i];
	}
	
	public T set(int i, T t) {
		if (i<0||i>=numItems) throw new IndexOutOfBoundsException();
		else { 
			T temp = seq[i]; seq[i] = t;
			return temp;
		}
	}

	public boolean add(T t) { 
		add(numItems,t);
		return true; // for compatibility reasons only
	}

	public void add(int i, T t) {
		if (i<0 || i>numItems) throw new IndexOutOfBoundsException();
		if (numItems==seq.length) resize(); // extend seq
		for (int k=numItems; k>i; k--) // shift seq[i..] to right
			seq[k] = seq[k-1];
		seq[i] = t;
		numItems++;
	}
	/*public void add(T t){
		Iterator<T> it = List.iterator();
		if(it.hasNext()==false){
			t=it.next();
		}
	}*/
				
	private void resize() { // seq is full -- double its size
		T[] temp = (T[])(new Object[seq.length*2]); // bigger array
		for (int i=0; i<seq.length; i++) // copy over items 
			temp[i] = seq[i];
		seq = temp; 
	}
	
	public Iterator<T> iterator() {
		return new MyIterator<>(seq,numItems);
	}

	public int IndexOf(T t){
		for (int i=0;i<numItems;i++){
			if(seq[i] == t){
				return i;
			}
		}
		return -1;
		
	}
	
	public void addFirst(T t){
		numItems++;
		for (int i=numItems;i>=0;i--){
			seq[i+1] = seq[i];
		}
		seq[0]=t;
			
	}
	
	public T remove(int x) {
				T ans = seq[x];
				for(int k=x;k<numItems;k++){
					seq[k]=seq[k+1];
				}
				numItems--;
				return ans;

	}	

	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<>();
		aList.add(1);
		aList.add(2);
		aList.add(3);
		aList.add(4);
		aList.add(5);
		/*Iterator<Integer> it = aList.iterator();
		while(it.hasNext()){
			System.out.println(aList.IndexOf(4));
		}*/
		aList.addFirst(7);
		System.out.println(aList.remove(4));
		for(int i: aList){
			System.out.println(i);
		}
		System.out.println(aList.IndexOf(9));
		//System.out.println(aList.remove(5));
	}

}
