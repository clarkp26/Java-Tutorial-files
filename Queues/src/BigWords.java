import java.io.Console;
import java.util.Scanner;

class BigWords {
	public static void main(String[] args) {
		Queue<String> q = new Queue<>(); 						
		q.enq("Cat");
		q.enq("Dog");
		q.enq("Pig");
		q.enq("Cow");
		q.enq("Duck");
		q.enq("Horse");
		
		/*System.out.println(q.deq());
		System.out.println(q.deq());
		System.out.println(q.deq());*/
		System.out.println("Top of Queue: " + q.First() +"\n");
		System.out.println("Queue Size: " + q.Size() +"\n");
		q.put();
		}
	}


