
public class Node<T> {

	private T item;
	private Node<T> next = null;
	
	public Node(T i, Node<T> n){
		next=n;
		item=i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
