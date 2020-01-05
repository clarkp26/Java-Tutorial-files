import java.util.Scanner;


public class Statistics {

private double[] array;
private int arrayLength;

public Statistics(double[] a){
	array = a;
	arrayLength = array.length;
}

public double Max(){
	double max = array[0];
	for (int i =1;i<arrayLength;i++){
		if (array[i] > max){
			max = array[i];
		}
	}
	return max;
}
	
public double Average(){
	double av = 0;
	for (int i =0;i<arrayLength;i++){
		av = av + array[i];
	}
	return av/arrayLength;
}
public void display(){
	for (int i =0;i<arrayLength;i++){
	System.out.println(array[i]);
	}
}
	
	public static void main(String[] args) {
		double[] Nums = {1,2,3,4,5,6,7,8,9,10};
		Statistics a = new Statistics(Nums);
		a.display();
		System.out.println("Max Value is " + a.Max());
		System.out.println("Average Value is " + a.Average());
		
		
	
	}
}


