import java.util.Stack;

//import org.w3c.dom.Node;


public class Exercise1<T> {
private T[] seq;
private int bound =0;
private Node<T> head = null;

private static class Node<T> {

	private T item;
	private Node<T> next = null;
	
	public Node(T i, Node<T> n){
		next=n;
		item=i;
	}
}
/*public Exercise1(int n){
	seq=(T[])(new Object[n]);
}*/

/*public Exercise1(){
	seq=(T[])(new Object[3]);
}*/

public boolean isEmpty(){
	if(seq == null){
		return true;
	}
	else{
		return false;
    }
}

public boolean push(T t){
	//if (bound<seq.length){
	
	 /*seq[bound] =t;
     bound++;
     return true;*/
	
	head=new Node<>(t,head);
	return true;
		
	/*	}
	else{
		return false;
	}*/
}

public T pop(){
	if(isEmpty()==true){
		return null;
	}
	else{
		System.out.println("Being Removed: " + seq[bound]);
		bound--;
		return seq[bound];
	}
}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();
		stack.push(14);
		stack.push(137);
		stack.push(12);
		stack.push(102);
		
		System.out.println(stack);
		
		for( int i=0;i<1;i++){
		stack.pop();
		}
		
		System.out.println(stack);

	}

}
