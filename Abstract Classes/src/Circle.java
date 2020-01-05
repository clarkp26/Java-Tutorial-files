import java.util.*;
public class Circle extends Shape{
	
	private double radius;
	
	public Circle(String n,double r){
		super(n);
		radius =r;
	}
	public double area(){
		return Math.PI*(radius*radius);
	}
	
	public double perim(){
		return Math.PI*(2*radius);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
