
public abstract class Person {

	private String name,address;
	private boolean sex;
	
	public Person(String n, String a, boolean s){
		name= n;
		address=a;
		sex=s;
	}
	
	public abstract int completionYear();
	
	public void put(){
		System.out.println("Name: " + name + "\nAaddress: "+  address +"\nAre they Male? "
				+ sex +"\nYear of Completion: "+ completionYear());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
