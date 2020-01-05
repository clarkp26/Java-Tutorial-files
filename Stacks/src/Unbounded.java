import java.util.Stack;


public class Unbounded<T> {

	private T[] stack;
	private int top;
	
	public boolean isEmpty(){
	if(stack == null){
		return true;
	}
	else return false;
	}
	
	public boolean push(T t){
		top++;
		stack[top]=t;
		return true;
	}
	
	public T pop(){
		if(isEmpty()==true){
			return null;
		}
		else{
			top--;
			return stack[top];
		}
	}
	
	public static void main(String[] args) {
         Stack<Integer> s = new Stack();
         for(int i=0;i<10000000;i++){
         s.push(1);
         s.push(2);
         s.push(3);
         s.push(4);
         }
         
         
         System.out.println(s);
         for(int i=0;i<4;i++){
         System.out.print(s.pop()+"  ");
         }
	}

}
