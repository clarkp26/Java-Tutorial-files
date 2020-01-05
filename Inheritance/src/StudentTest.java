
public class StudentTest {
	
	/*private static void printout(Student[] s){
		for (int i =0;i<s.length;i++){
			if (s[i] == new Student()){
				s[i].put();
			}
			else if(s[i] == new PGStudent()){
				s[i].put();
			}
		}
	}*/
	 private static void printout(Student[] ss){
		 for(Student s : ss){
			 s.put();
		 }
		 /*for(PGStudent x : ss) x.put1();*/
	 }
	public static void main(String[] args)
	{
		Student[] students = {new Student("Mary Smith","CA"),
				new PGStudent("Bill Smart","PHD","Dr. Jim Murphy"),
				new Student("Pat Kelly","EE")};
		/*PGStudent student = new PGStudent("Bill Smart","PHD","Dr. Jim Murphy");*/

		printout(students);

	}

}
