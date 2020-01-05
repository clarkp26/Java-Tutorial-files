
public class Student {

	protected int year;
	protected String name, program;

	public Student(String n,int y,String p) {
		name =n;
		year = y;
		program = p;				
	}
	public Student() {}
	public void display() {
		System.out.println("Name: "+ name + "\nYear: "+ year + "\nProgram: " + program);;
	}
	

}
