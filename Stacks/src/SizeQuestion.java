import java.util.Stack;


public class SizeQuestion<T> {
	
	private Node<T> head = null;
	
	private static class Node<T> {
		
		private Node<T> head = null;
		private T item;
		private Node<T> next = null;
		
		public Node(T i, Node<T> n){
			next=n;
			item=i;
		}
		public int size(){
			int count = 0;
			Node<T> p =head;
			while(p!=null){
				count++;
				p=p.next;
			}
			return count;
		}
	}
	
	
	
	/*public SizeQuestion(){}
	
	public SizeQuestion(int n){
		
	}*/
	
	public boolean push(T t){
		head = new Node<>(t,head);
		return true;
	}
	
	public T pop(){
		if(head==null){
			return null;
		}
		else{
			T t = head.item;
			head=head.next;
			return t;
		}
	}
	

	
	public static void main(String[] args) {
       Stack<Integer> stack = new Stack();
       
       stack.push(1);
       stack.push(2);
       stack.push(3);
       stack.push(4);
       
       System.out.println("Size is Now: " +stack.size());
       
       stack.pop();
       stack.pop();
       stack.pop();
       
       System.out.println("Size is Now: " +stack.size());
       
       stack.push(3);
       stack.push(4);
       //System.out.println(stack.pop());
       System.out.println("Size is Now: " +stack.size());
	}

}
