
public class Student extends Person {

	private String studentnum,subject;
	private int year;
	
	public Student(String n, String a, boolean s, String st, String su,int y){
		super(n,a,s);
		studentnum = st;
		subject = su;
		year = y;
	}
	
	public int completionYear(){
		return 2021 - year;
	}
	
	public void put(){
		super.put();
		System.out.println("Student Number: " + studentnum + "\nSubject: " + subject);
	}
	
	public static void main(String[] args) {
		Person p = new Student("Dan","Cavan",true,"1234567","Maths",3);
		p.put();

	}

}
