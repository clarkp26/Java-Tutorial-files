import java.io.IOException;


public class Exercise1<T> {
private T[] seq;
private static int size =1;
private int head =0;
private int tail =0;

public Exercise1(int n){
	seq =(T[])(new Object[n]);
}

public Exercise1(){
	this(3);
}

public boolean isEmpty(){
	if (size==0){
		return true;
	}
	else return false;
}

public boolean enq(T t){
	if (size<seq.length){
		seq[tail]=t;
		tail = (tail+1)%seq.length;
		size++;
		return true;
	}
	else {
		T sample[] = seq;
		seq = (T[])(new Object[seq.length*2]);
		for(int i=0;i<sample.length;i++){
			seq[i]=sample[i];
		}
		
		if (size<seq.length){
			seq[tail]=t;
			tail = (tail+1)%seq.length;
			size++;
			return true;
		}
		return false;	
	}
}
     public T deq(){
	      if(isEmpty()==true) {
	    	  return null;
	      }
	      else{
	    	  T b = seq[head];
	    	  head=(head+1)%seq.length;
	    	  size--;
	    	  return b;
	      }
}
	//when array full double seq size
	public static void main(String[] args){
		Exercise1<Integer> p = new Exercise1();
		p.enq(1);
		p.enq(2);
		p.enq(3);
		p.enq(4);
		p.enq(5);
		p.enq(6);
		p.enq(7);
		
		while (p.isEmpty()==false){
			if (size>=1){
			int x = p.deq();	
		
		System.out.println(x);
		}
		}                            
		
	}
}
