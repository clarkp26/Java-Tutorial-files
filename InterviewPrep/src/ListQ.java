import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ListQ {
//	ArrayList<Integer> L = new ArrayList<>(400);
//	
//	public void insert(int index,int value) {
//		L.add(y,x);
//	}

	public static void main(String[] args) {
//		System.out.println("Define List Size");
//		Scanner in = new Scanner(System.in);
//		int size = in.nextInt();
//		ArrayList<Integer> L = new ArrayList<>(size);
//		System.out.println("Input Array elements");
//		for(int i=0;i<size;i++) {
//			L.add(in.nextInt());
//			
//		}
//		System.out.println(L);
//		System.out.println("Add Elements");
//		L.add(in.nextInt(),in.nextInt());
//		System.out.println(L);
//		System.out.println("Delete Elements");
//		L.remove(in.nextInt());
//		System.out.println(L);
//		
//		Vector<String> v = new Vector<String>(500);
//		v.add("Hello");
//		v.add("Well");
//		v.add("Yeeeooo");
//		System.out.println(v);
//		v.add(0,"New String");
//		System.out.println(v);
//		System.out.println(v.get(3));
		
		int numArrays = 10;
        ArrayList<ArrayList<Integer>> L = new ArrayList<ArrayList<Integer>>(4);
        Scanner in = new Scanner(System.in);
        System.out.println("Number of Lists");
        int ListSize = in.nextInt();
        for( int i=0;i<ListSize;i++) {
        	ArrayList<Integer> x = new ArrayList<Integer>();
    		System.out.println("Define List Size");
    		
    		int size = in.nextInt();
    		System.out.println("Define List Elements");
    		for (int j=0;j<size;j++) {
    			x.add(in.nextInt());
    		}
    		L.add(i+1,x);
        }
        System.out.println(L);

        System.out.println("Number Elements To Get From List");
        int Elements = in.nextInt();
        for (int i=0;i<Elements;i++) {
        	System.out.println("Enter List Number and Index");
        	int ListNum = in.nextInt();
        	int IndexNum = in.nextInt();
        	try {
        	L.get(ListNum).get(IndexNum);
        	System.out.println(L.get(ListNum).get(IndexNum));
        	}
        	catch(Exception e){
        		System.out.println("ERROR!");
        	}
        }
        int[] arr = {6,4,5,7,9,32,5};
//        arr.quicksort();
		
	}

}
