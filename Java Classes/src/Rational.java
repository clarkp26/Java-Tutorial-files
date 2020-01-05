import java.text.DecimalFormat;
import java.util.*;


public class Rational {

	private  double num;
	private  double dem;
	private int rat;
	
	public Rational(double n, double d){
		num=n;
		dem=d;
		/*rat = r;*/
	}
	
	public Rational(){}
	
	public void get(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Numerator: ");
		num = in.nextInt();
		System.out.print("Enter Denominator: ");
		dem = in.nextInt();
		/*rat = num/dem;
		System.out.println("The Rational number is: " + rat);*/
	}
	
	public static int gcd(Rational a){
		double x = Math.abs(a.num);
		double y = Math.abs(a.dem);
		int divider = 1;
		int counter = 0;
		double k = x+y;
		for (int i=0;i<k; i++){
			if (x%divider == 0 && y%divider ==0){
				counter = divider;
				divider++;
			}
			else{
				divider++;
			}
		}	
		return counter;
	}
	
	public Rational add(Rational a){
		double num1 = (a.num*dem)+(num*a.dem);
		double dem1 = a.dem*dem;
		Rational k = new Rational(num1,dem1);
		int x = gcd(k);
		Rational f = new Rational(num1/x,dem1/x);
		return f;
	}
	
	public Rational subtract(Rational a){
		double num1 = (a.num*dem)-(num*a.dem);
		double dem1 = a.dem*dem;
		Rational k = new Rational(num1,dem1);
		int x = gcd(k);
		Rational f = new Rational(num1/x,dem1/x);
		return f;
	}
	
	public Rational multiply(Rational a){
		double num1 = a.num*num;
		double dem1 = a.dem*dem;
		Rational k = new Rational(num1,dem1);
		int x = gcd(k);
		Rational f = new Rational(num1/x,dem1/x);
		return f;
	}
	public Rational divide(Rational a){
		double num1 = a.num*dem;
		double dem1 = a.dem*num;
		Rational k = new Rational(num1,dem1);
		int x = gcd(k);
		Rational f = new Rational(num1/x,dem1/x);
		return f;
	}
	
	public static boolean equals(Rational a, Rational b){
		if(a.num == b.num && a.dem == b.dem){
			return true;
		}
		else return false;
	}
	

	/*public static int gcd(Rational a){
		int n1 = Math.abs(a.num);
		int d1 = Math.abs(a.dem);
		if (n1<=d1){
			return gcd2(n1,d1);
		}
		else{
			return gcd2(n1,d1);
		}
	}
	
	public static int gcd2(int n, int d){
		if (d ==0){
			return n;
		}
		else{
			return gcd2(d%n,d);
		}
	}*/
	
	
	public static String doubleValue(Rational a){
		double x = (a.num/a.dem);
		DecimalFormat df = new DecimalFormat("#.00");
		String formatted = (df.format(x));
		
		return formatted;
	}
	
	public  String toString(){
		return num + "/" + dem;
	}
	public static void main(String[] args) {
		Rational a = new Rational(13,3);
		Rational b = new Rational(7,3);
		Rational c = new Rational(5,3);
		
		/*a.get();
		b.get();*/
		
		Rational x = a.add(b);
		
		System.out.println("Add: " + x.toString() );
		Rational y = a.subtract(b);
		System.out.println("Subtract: " + y.toString());
		Rational z = b.multiply(a);
		System.out.println("Multiply: " + z.toString());
		Rational i = a.divide(b);
		System.out.println("Divide: " + i.toString());
		
		System.out.println("doubleValue: " + doubleValue(a));
		System.out.println("do they equal? " + equals(a,b));
		
		
	}

}
