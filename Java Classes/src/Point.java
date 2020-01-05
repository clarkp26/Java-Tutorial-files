import java.util.Scanner;


public class Point {

	private double x, y;
	
	public Point(double xx, double yy){
		x=xx;
		y=yy;
	}
	
	public Point(){}
	
	public void get(){
		Scanner in = new Scanner(System.in);
		System.out.print("First point: ");
		x = in.nextDouble();
		System.out.print("Second point: ");
		y = in.nextDouble();
	}
	/*public void put(double x,double y){
		return "(" + x + "," + y + ")";
	}*/
	public Point MidPoint(Point p){
		double p1 = (x + p.x)/2;
		double p2 = (y + p.y)/2;
		
		Point k = new Point(p1,p2);
		
		return k;
	}
	
	public String ToString(){
		return "(" + x + "," + y + ")";
	}
	public static void main(String[] args) {
		Point i = new Point();
		Point j = new Point();
		
		i.get();
		j.get();
		
		System.out.println("The Mid Point is: " + (j.MidPoint(i)).ToString());

	}

}
