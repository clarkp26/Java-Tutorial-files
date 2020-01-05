
public class Lecturer extends Person {

	private String department,staffnum;
	
	public Lecturer(String n, String a, boolean s, String d, String sn){
		super(n,a,s);
		department = d;
		staffnum = sn;
	}
	
	public int completionYear(){
		int x = Integer.parseInt(staffnum);
		int y = x%100;
		return (2016+65)-y;
	}
	
	public void put(){
		super.put();
		System.out.println("Department: " + department + "\nStaff Number: " + staffnum);
	}
	
	public static void main(String[] args) {
		Person c = new Lecturer("Dave","Fermanagh",true,"Science","3547");
		c.put();

	}

}
