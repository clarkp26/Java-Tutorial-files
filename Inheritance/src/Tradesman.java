
public class Tradesman extends Employee {

	private String trade;
	
	public Tradesman(String n,String d,String t){
		super(n,d);
		trade = t;	
	}
	
	public Tradesman(){}
	
	/*public static void printout(Tradesman t){
		super.printout();
		System.out.println(" Trade: "+ t.trade);
	}*/
	
	public String toString(){
		/*super.toString();*/
		/*return name + "\n" + department + "\n" +trade + "\n";*/
		return super.toString()  +trade+ "\n";
	}
	
	public static void main(String[] args) {
		Tradesman Dave = new Tradesman("Dave","Maintenance","Electrician");
		printout(Dave);
		Tradesman x = new Tradesman("Dave","Maintenance","Electrician");
		System.out.println("Are they the same: " + equals(Dave,x));

	}

}
