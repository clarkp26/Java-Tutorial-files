
abstract class Shape {

	private String name;
	
	public Shape(String n){
		name=n;
	}
	
	public Shape(){}
	
	public abstract double area();
	
	public abstract double perim();
	
	public void put(){
		System.out.println(name + " with area " + area()
				+ " and perimeter " + perim());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
