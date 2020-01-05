import java.util.*;
public class Q1c {

	public static class Node{
		Node next;
		int item;
		
		public Node(Node n, int i){
			next=n;
			item=i;
		}
	}
	Node head= null;
	
	//Node p = head;
	public void add(int n){
		/*Node p = head;
		if (head==null){
			head=new Node(head,n);
			return;		
		}
			while(p.next!=null){
			p=p.next;			
		}
		p.next=new Node(p.next,n);
		return;
		*/
		Node p = head;
		if (head==null){
			head=new Node(head,n);
			return;		
		}
		while(p!=null){//goes through list
			if(n>p.item){//keeps incrementing until n finds its spot
				if(p.next==null){
					p.next = new Node(p.next,n);
					return;
				}
				p=p.next;
			}
			else if(n<=p.item){//when n finds its spot	
				p.next= new Node(p.next,p.item);//inserts new node in front with old item
				p.item=n; //puts new item in old node
				return;
			}
		}
		
	}
	public boolean contains(int n){
		Node p = head;
		if(head==null){
			return false;
		}
		while(p!=null){
			if(p.item==n){
				return true;
			}
			p=p.next;
		}
		return false;
	}
	public static void main(String[] args) {
		Q1c x = new Q1c();
		x.add(1);
		x.add(3);
		x.add(5);
		x.add(4);
		x.add(2);
		
		Node p = x.head;
		while (p!= null){
			System.out.println(p.item);
			p=p.next;
		}
        System.out.println(x.contains(10));
	}

}
