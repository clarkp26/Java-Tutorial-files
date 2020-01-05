import java.util.*;

public class Sortnames<T> implements Comparable<T> {

private T[] names = (T[])(new Object[1000]);
private int count =0;

public void add(T t){
	names[count]=t;
	count++;
}

public void print(){
	for (int i=0;i<count;i++){
		System.out.println(names[i]);
	}
}

public int compareTo(T t){
	String y = (String) t;
	int c = 0;
	for(int i=0;i<count;i++){
		String x = (String) names[i];
		if(x.length()-y.length() > 0){
			c++;
		}
	}
	return c;
}

public void sort(){
	for(int i = 0;i<count;i++){
		for (int j=i+1;j<count;j++){
			if( ((String) names[i]).compareTo((String)names[j])>0){
				T t;
				t =names[i];
				names[i]= names[j];
				names[j]= t;
			}
		}
	}
}

	public static void main(String[] args) {
	 Sortnames<String> x = new Sortnames<>();
	 x.add("Cat");
	 x.add("Dog");
	 x.add("Monkey");
	 x.add("Cow");
	 
	 
	 x.sort();
	 x.print();
	 

}
}
