import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;

//import com.sun.corba.se.impl.orbutil.graph.Node;
class Generics {

	private static class Node<T> {

		private T item;
		private Node<T> next = null;
		
		public Node(T i, Node<T> n){
			next=n;
			item=i;
		}
	}
	public static<T> void printArray(T[] arr) {
		for (T x: arr) {
			System.out.println(""+x);
		}
	}
//	public static boolean BracketCheck(Stack p) {
//		Node<T> x = p.next;
//	}
	public static void main(String[] args) {
		Generics t = new Generics();
		String[] x = {"one","two","three"};
		int[] y = {1,2,3};

//	    printArray(x);
//		printArray(y);
		
		Stack<String> stack = new Stack();
		String one = "{}()";
//		String two = "({()})";
//		String three = "{}(";
//		String four = "[]";
		
		String[] g = one.split("");
		for (int i=0;i<one.length();i++) {
			stack.push(g[i]);
		}

		if(stack.peek().isEmpty() != true )
//		stack.push(1);
//		stack.push(3);
//		stack.push(7);
		
//		stack.pop();
		System.out.println(stack.peek());
		
	}

}
