
public class Student {

	protected String name;
	protected String programme;
	
	Student(String n,String p){
		name = n;
		programme = p;
	}
	
	Student(){}
	
	public void put(){
		System.out.println(name + "\n" + programme);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
