import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

//import TreeSet.Node;
import jdk.nashorn.api.tree.Tree;

public class TreeTest {
//
//    private Node root = null;
//	public class Node{
//		 int data;
//		 Node right;
//		 Node left;
//	}
//	public static void PreOrderTraverse(Node root) {
//		if(root.left != null) {
//			PreOrderTraverse(root.left);
//		}
//		System.out.println(root.data);
//        if(root.right != null) {
//			PreOrderTraverse(root.right);
//		}
//	}
	
	public static void AnagramCheck(String a,String b) {
		int count =0;
		 
		for(int i=0;i< a.length();i++) {
			if(b.indexOf(a.charAt(i)) < 0) {
				count++;
				System.out.print(a.charAt(i));
				
			}
			else {
				int index = b.indexOf(a.charAt(i));
				b = b.substring(0, index-1) + b.substring(index+1);
			}
		}
		System.out.println("\n");
		for (int i=0;i<b.length();i++){
			if(a.indexOf(b.charAt(i)) < 0) {
				count++;
				System.out.print(b.charAt(i));
//				int index = a.indexOf(b.charAt(i));
//				a = a.substring(0, index-1) + a.substring(index+1);
			}
			else {
				int index = a.indexOf(b.charAt(i));
				a = a.substring(0, index-1) + a.substring(index+1);
			}
		}
		System.out.println("\n"+count);
		
	}
	public static int f0 =0;
	public static int f1 = 1;
	public static int f2 = 0;
	public static int fibonacci(int n) {
		if( n < 2) {
			return f2;
		}
			f2 = f1+f0;
			f0 = f1;
			f1 = f2;
		
		return fibonacci(n-1);
	}
	public class Node{
		private int data;
		private Node head;
	}
	public boolean hasCycle(Node head) {
		return true;
	}
	public static void main(String[] args) {
//	TreeSet<Integer> t = new TreeSet();
//	t.add(1);
//	t.add(7);
//	t.add(5);
//	t.add(3);
//	t.add(9);
//	t.add(4);
//	Node rot = null;
//	System.out.println(t);
//	PreOrderTraverse(rot);

//		AnagramCheck("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke");
//		System.out.println(fibonacci(6));
		LinkedList<Integer> t = new LinkedList<Integer>();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(5);
		t.add(3);
		t.add(5);
		t.add(3);
		t.add(5);
		t.add(3);
		System.out.println(t);
		Scanner in = new Scanner(System.in);
		String y = in.nextLine();
		String x = "Hackrank";
		String s = " The Best";
		System.out.println(x+s+y);
	}

}
