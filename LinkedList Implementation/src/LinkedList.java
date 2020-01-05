import java.util.Stack;


public class LinkedList<T> {

	private static class Node<T> {            
		private T item; 				// data       
		private Node<T> next;			// successor node 
	                                                          
		Node(T item0, Node<T> next0) { 
			item = item0; next = next0;
		}
	}

	private Node<T> head = null; // first node (null if list empty)
	private Node<T> tail = null; // final node (null if list empty)
	private int numItems = 0;	  // number of items

	public int size() {return(numItems);}

	public T get(int i) {
		if (i<0||i>=numItems) throw new IndexOutOfBoundsException();
		Node<T> p = head; int pIndex = 0; // Node p at index pIndex
		while (pIndex!=i) {
			p = p.next; pIndex++;
		}
		return p.item;
	}
	
 
	public T set(int i, T t) {
		if (i<0||i>=numItems) throw new IndexOutOfBoundsException();
		Node<T> p = head; int pIndex = 0; // Node p at index pIndex
		while (pIndex!=i) {
			p = p.next; pIndex++;
		}
		T temp = p.item; p.item = t;
		return temp;
	}
	
	public boolean add(T t) { 
		Node<T> tNode = new Node<T>(t,null); // new tail node
		if (tail!=null) tail.next = tNode; 
		else head = tNode;
		tail = tNode;
		numItems++;
		return true; // for compatibility reasons only
	}

	public void add(int i, T t) { 
		if (i<0 || i>numItems) throw new IndexOutOfBoundsException();
		if (i==0) { // insert at front
			head = new Node<T>(t,head);
			if (tail==null) tail = head;
		}
		else { // not at front
			Node<T> p = head;
			int index = 1; // p references node at position index-1
			while (index!=i) {
				p = p.next; index++;
			} // node p at position i-1
			p.next = new Node<T>(t,p.next); // insert t following p
			if (tail==p) tail = p.next;
		}
		numItems++;
	}	
	
	

	public int indexOf(T t){
		int count =0;
		Node<T> p = head;
		while(p!=null){
			if(p.item == t){
			    return count;
		    }
			p=p.next;
			count++;
		}
		return -1;
	}
	
	public void addFirst(T t){
		Node<T> p = new Node<T>(t,head);
		head = p;
	}
	public void leftRotate(){
		Node<T> p = head;
		T t = p.item;
		while(p.next!=null){
			p.item = p.next.item;
			p=p.next;
		}
		tail.item=t;
	}
	
	public T remove(int i){
		int count =1;
		Node<T> p = head;
		while(count!=i){
			count++;
			p=p.next;
		}
		while(p.next!=null){
			
			p.item = p.next.item;
			p=p.next;
		}
		p.item =null;
		    p=null;
			
			return null;
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> x= new LinkedList<>();
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(4);
		x.add(5);
		
		x.addFirst(7);
		
		//System.out.println(x.indexOf(4));
		//x.leftRotate();
		x.remove(3);
	    Node p = x.head;
		while (p!=null){	
		
			System.out.println(p.item);
			p=p.next;
		}
		/*Stack stack = new Stack();
		stack.push("B");
		stack.push("J");
		stack.push("C");
		Object x = stack.pop();
		stack.push("D");
		stack.push(x);
		
		while(stack.isEmpty()==false){
			System.out.println(stack.pop());
		}*/
	}
	

}
