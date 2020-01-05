

class LinkedSet<T> {
		
	private static class Node<T> {            
		private T item; 				// data       
		private Node<T> next;			// successor node 
	                                                          
		Node(T item0, Node<T> next0) { 
			item = item0; next = next0;
		}
	}            
		
	private Node<T> head = null; 	 

	public int size() {
		Node<T> p = head; int numItems = 0;
		while (p!=null) {
			numItems++; p = p.next;
		}
		return(numItems);
	}
	
	public boolean add(T t) { 
		if (contains(t)) return false;
		head = new Node<T>(t,head); // place t at front (easiest)
		return true;
	}

	public boolean contains(T t) { 
		Node<T> p = head; // remains to search from p on
		while (p!=null && !equals(p.item,t)) 
			p = p.next;
		return p!=null;
	}

	public boolean remove(T t) { 
		Node<T> p = head; // t if present occurs from node p on
		Node<T> pPred = null; // predecessor of p (if any)
		while (p!=null && !equals(t,p.item)) {
			pPred = p; 
			p = p.next;
		}
		// t is present iff node p!=null & p!=null => t in node p
		if (p==null) return false; // t not found
		if (p==head) head = head.next; // t in node p at front	
		else pPred.next = p.next; // t in node p, not at front	
		return true;
	}  

	private boolean equals(T t1, T t2) { // allows t1, t2 be null
		if (t1!=null) return t1.equals(t2);
		else return t2==null;	
	}
	
	public boolean containsAll(LinkedSet<T> otherset){
		Node<T> o = otherset.head;
		Node<T> p = head;
		while(o!=null){
			while(p!=null){
				//boolean t = o.item.equals(p.item);
					//return false;
				if(p.item.equals(o.item)==true){
					//System.out.println(o.item);
					o=o.next;
					p=head; //restart p from top of list
					if(o==null){
						p=null; //gets out of while loop
					}
				}
				else {
					p=p.next;
				    if(p==null){
					return false;
				    }
				}
			}
			
		}
		return true;
		
	}
	
	public boolean equalsAll(LinkedSet<T> otherSet){
		Node<T> o = otherSet.head;
		Node<T> p = head;
		int count = 0;
		int count1 = 0;
		while(o!=null){
			count++;
			o=o.next;
		}
		while(p!=null){
			count1++;
			p=p.next;
		}
		if(count!=count1){
			return false;
		}
		while(o!=null){
			while(p!=null){
				
				if(p.item.equals(o.item)==true){
					//System.out.println(o.item);
					o=o.next;
					remove(p.item);//prevents duplicate objects percieved as true
					p=head; //restart p from top of list
					if(o==null){
						p=null; //gets out of while loop
					}
				}
				else {
					p=p.next;
				    if(p==null){
					return false;
				    }
				}
			}
			
		}
		return true;
		
	}
	
	public static void main(String[] args){
		LinkedSet<Integer> x = new LinkedSet<>();
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(4);
		x.add(5);
		
		LinkedSet<Integer> y = new LinkedSet<>();
		y.add(4);
		y.add(2);
		y.add(5);
		y.add(1);
		y.add(2);
		
		//System.out.println(x.containsAll(y));
		System.out.println(x.equalsAll(y));
		Node p = x.head;
		/*while (p!=null){
			System.out.println(p.item);
            p=p.next;		
		}*/
	}
}




