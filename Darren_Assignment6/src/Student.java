
public class Student {

	private String name, programme_code;
	private int id_number, year;
	
	public Student(String n,int id,int y, String p) {
		name =n;
		id_number = id;
		year =y;
		programme_code = p;
	}
	public void display() {
		System.out.println("Name: " +name+"\nID Number: "+id_number+"\nYear: "
	                       +year+"\nProgramme Code: "+ programme_code);
	}
	public static void main(String[] args) {
		Student s = new Student("Philip",1234,4,"ECE");
		s.display();

	}

}
