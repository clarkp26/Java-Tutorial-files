import java.util.*;


public class Queue<T> {
	
	private static class Node<T> {
		private T item;
		private Node<T> next;
		
		public Node(T i, Node<T> n){
			item=i;
			next=n;
		}
	}
	

	private Node<T> head = null;
	private Node<T> tail = null;
	//private Node<T> hNode = new Node<>(head.item,head);
	
	public Queue(){}//only included to make class compatible with bounded queue
	
	public Queue(int n){}////only included to make class compatible with bounded queue
	
	public boolean isEmpty(){
		/*if (head==null){
			return true;
		}
		else return false;*/
		return head==null;
	}
    public boolean enq(T t){
    	Node<T> tNode = new Node<>(t,null);
    	if (tail!=null){
    		tail.next = tNode;
    	}
    	else
    		head=tNode;
    		tail=tNode;
    		return true;
    	
    	
    }
	public T deq(){
		Node<T> hNode = new Node<>(head.item,head);
		
		if (isEmpty()==true){
			head.item = null;
			tail.item=null;
			return null;
		}
			T b = hNode.item;
			head=head.next;
			return b;	
		}

	public void put(){
 while (isEmpty()==false){
			
			T x = deq();
			if(x!=null){
		System.out.println(x);
		}
 }
	}
	
	public T First(){
		if(isEmpty()==true){
			return null;
		}
		else{
			return head.item;
		}
	}
	public int Size(){
		int count = 0;
		while(head!=null){
			head=head.next;
			count++;
		}
		return count;
	}
	
public static void main(String[] args){	
	}
}
