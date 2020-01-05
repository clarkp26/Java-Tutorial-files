
public class Employee {

	protected String name;
	protected String department;
	
	public Employee(String n, String d){
		name = n;
		department =d;
	}
	
	public Employee(){}
	
	public static boolean equals(Employee x, Employee y){
		if (x.name == y.name && x.department == y.department){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String toString(){
		return name + "\n" + department + "\n";
	}
	
	public static void printout(Employee t){
		System.out.println("Name: "+ t.name + " Department: "
				+ t.department);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
