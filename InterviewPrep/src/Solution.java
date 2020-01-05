import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
//		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
//		while(testCases>0){
//			int id = in.nextInt();
//			String fname = in.next();
//			double cgpa = in.nextDouble();
			
			Student st1 = new Student(33, "Rumpa", 3.68);
			Student st2 = new Student(85, "Ashis", 3.85);
			Student st3 = new Student(56, "Samiha", 3.75);
			Student st4 = new Student(19, "Samara", 3.75);
			Student st5 = new Student(22, "Fahim", 3.76);

			studentList.add(st1);
			studentList.add(st2);
			studentList.add(st3);
			studentList.add(st4);
			studentList.add(st5);
			
//			testCases--;
//		}
			for(int i =0;i<5;i++) {
				
			}
      
      	for(Student st: studentList){
			st.getCgpa();
		}
	}
}
