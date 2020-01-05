import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayListQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
        
		LinkedList<Integer> L = new LinkedList<>();
		for(int i=0;i<size;i++) {
            int x = in.nextInt();
           
			L.add(x);
			
		}
	
		int queries = in.nextInt();
		int count =0;
		while(count < queries) {
			String x = in.nextLine();
           if(x.equals("Insert")){
             int index = in.nextInt();
             int insert = in.nextInt();
             if(index>size-1) {
		        L.add(insert);
                }
             else {
            	 L.add(index,insert);
             }
             count++;
           }
           else if(x.equals("Delete")){
               int delete = in.nextInt();
		       L.remove(delete);
		       count++;
            }
		}
		for (int i = 0;i<L.size();i++) {
			System.out.print(L.get(i)+ " ");
		}
    
	}

}
