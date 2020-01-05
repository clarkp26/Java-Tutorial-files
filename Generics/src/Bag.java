/*import java.lang.Integer;*/

public class Bag<T> implements Comparable<T> {

@SuppressWarnings("unchecked")
private T[] bag = (T[])(new Object[1000]);

private int nums = 0;

/*public Bag(T[] w){
bag=w;	
}*/
	
public int compareTo(T t){
	int c=0;
	for (int i =0;i<nums;i++){
int x = (Integer) bag[i] - (Integer)t;
if(x>0){
	c++;
}
}
	return c;
}

public int NumGreater(T y){
	int count =0;
	if (compareTo(y)>0){
     count++;
	}
	return count;
}

public void add(T x){
	bag[nums] = x;
		nums++;
		}


public void remove(T x){
T u = bag[nums];
for (int i=0;i<nums;i++){
	if(bag[i]==x){
		bag[i]=u;
		bag[nums]=null;
		nums--;
	}
}
}

public void print(){
	for(T k: bag){
		if (k != null)
		System.out.println(k);
	}
}



	public static void main(String[] args) {	
		/*na.add(new Integer(1));
		na.add(new Integer(2));
		na.add(new Integer(3));
		na.add(new Integer(4));*/
		Bag<Integer> b = new Bag<>();
		b.add(3);
		b.add(7);
		b.add(10);
		/*b.remove("oh");*/
		System.out.println("Numbers greater: "+ b.compareTo(22));
		b.print();
		
		/*names.remove(2);
		names.print();*/

		
		
		
	}



}
