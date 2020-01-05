
public class PGStudent extends Student{

	private String Supervisor; 
	
	public PGStudent(String n, String p, String s){
		super(n,p);
		Supervisor = s;
	}
	
	public PGStudent(){}
	
	public void put(){
		super.put();
		System.out.println("Supervisor: " + Supervisor);
	}
	public static void main(String[] args) {
		PGStudent Kevin = new PGStudent("Kevin", "ECE", "Rory");
		Kevin.put();
		

	}

}
