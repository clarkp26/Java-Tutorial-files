
public class Point2D {
private int x, y;

public Point2D(int xx,int yy) {
	x=xx;
	y=yy;
}
public void print() {
	System.out.println("x: "+x+ "\ny: "+y);
}
public double distance(Point2D p) {
	return Math.sqrt((p.x-x)^2+(p.y-y)^2);
}
	public static void main(String[] args) {

		Point2D x = new Point2D(1,2);
		Point2D y = new Point2D(3,4);
		x.print();
		y.print();
		System.out.println("Distance Between the two Points: "+x.distance(y));
	}

}
