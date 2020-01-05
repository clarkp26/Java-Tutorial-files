
public class Rectangle extends Shape{

		private double height,width;
		
		public Rectangle(String n,double h,double w){
			super(n);
			height = h;
			width = w;
		}
		public double area(){
			return width*height;
		}
		
		public double perim(){
			return (width+height)*2;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
