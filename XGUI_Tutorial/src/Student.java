
public class Student {

	protected String name, sex, address;
	protected int telephone, id;
	
	public Student(int id,String name, String sex, String address, int telephone ) {
		this.name = name;
		this.sex = sex;
		this.address = address;
		this.telephone = telephone;
		this.id = id;
	}

	public void display() {
		System.out.println("ID: " +id+"\nName: "+name+"\nGender: "+sex
				+"\nAddress: "+address+"\nTelephone: "+telephone);
	}
	

	public static void main(String[] args) {
//		Student s= new Student(1234,"Philip","male","Cavan",862042700);
//		s.display();

	}

}
