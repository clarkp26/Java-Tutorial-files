import java.util.Arrays;
public class Statistics {

	private double[] Array;
	private int ArrayLength;
	
	public Statistics(double[] a) {
		Array = a;
		ArrayLength = a.length;
	}
	public double Average() {
		double count = 0;
		for(int i=0;i<Array.length;i++) {
			count = count + Array[i];
		}
		return count/ArrayLength;
	}
	public double Max() {
		double max = Array[0];
		for(int i=1;i<Array.length;i++) {
			if(Array[i] > max) {
				max = Array[i];
			}
		}
		return max;
	}
	public double Min() {
		double min = Array[0];
		for(int i=1;i<Array.length;i++) {
			if(Array[i] < min) {
				min= Array[i];
			}
		}
		return min;
	}
	public double Median() {
		double x = 0;
		int y = 0;
		if(ArrayLength%2 ==0) {
			double c = Array[(ArrayLength/2)] + Array[(ArrayLength/2)-1];
			return c/2;
		}
		else 
			x = (ArrayLength/2) + 0.5;
		    y = (int) x;
			return Array[y];
	}
	public double[] sort() {
		Arrays.sort(Array);
		return Array;
	}
	public void display() {
		System.out.print("Array: ");
		for (int i=0;i<Array.length;i++) {
			if(i!= (Array.length-1)){
			System.out.print(Array[i] + ", ");
			}
			else {
				System.out.println(Array[i]);
			}
		}
	}
	public static void main(String[] args){
		double[] Ara = {1,2,3,4,5,6,7,8,9,10};
		double[] Araa = {1,2,3,4,5,6,7,8,9,10,11};
		double[] Sorting = {7,6,2,10,11,4,3,9,1};

		Statistics s = new Statistics(Ara);
		Statistics z = new Statistics(Araa);
		Statistics b = new Statistics(Sorting);

		s.display();
		System.out.println("Average: " + s.Average());
		System.out.println("Maximum: " + s.Max());
		System.out.println("Minimum: " + s.Min());
		System.out.println("Median: " + s.Median());
		System.out.println("Median: " + z.Median());
		b.sort();
		b.display();


	}
}
