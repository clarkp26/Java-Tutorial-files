import java.util.Vector;

public class Programme {

	private String title;
	private int year, Calyear;
	private Vector<Student> students;

	
	public Programme(String title, int year, int calyear, Vector<Student> students) {
		super();
		this.title = title;
		this.year = year;
		Calyear = calyear;
		this.students = students;
	}

	public void StudentAdd(Student s) {
		students.add(s);
	}

	public void display() {
		System.out.println("Title: "+title+"\nYear: "+year+"\nCalender Year: " + Calyear);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
