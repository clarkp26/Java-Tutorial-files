import java.util.*;

public class Staff  {

	/*private Employee[] staff = new Employee[10];*/
	
	
	private ArrayList staff = new ArrayList();
	/*public Staff( String n,String d,String t,Staff[] s){
		super(n,d,t);
		staff = s;
	}*/
	
	public Staff(){}
		
	
	public void hire(Employee e){
		staff.add(e);
		}
	public void fire(Employee e){
		staff.remove(e);
	}
	public void put(){
		Object[] x = staff.toArray();
		/*for(Object y : x){
			System.out.println(y.toString());*/
		for (int i =0;i<x.length;i++){
		System.out.println(x[i].toString());
	}
	}
	
	public static void main(String[] args) {
		
	}

}
