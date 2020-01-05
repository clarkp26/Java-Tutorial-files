import java.util.*;

public class Exercise7 {
	
	public static int SumFacs(int a){
		int divider = 1;
		int counter = 0;
		for( int i=0;i<a;i++){
			if (a%divider == 0){
				counter = counter + divider;		
			}
		divider++;
		}
		
		return counter;		
	}
	
	public static boolean isPerfect(int n){
		int divider = 1;
		int counter = 0;
		for( int i=0;i<n;i++){
			if (n%divider == 0){
				counter = counter + divider;		
			}
		divider++;
		}
			if (counter	== n){
				
				return true;
			}
			else{
				
				return false;
			}
	}
	public static int[] isPerf(){
		
		int m = 0;
		int[] nums = {};
		
		int divider = 1;
		
		for (int x=0;x<1000;x++){
			int counter = 0;
			
		for( int i=0;i<x;i++){
			if (x%divider == 0){
				counter = counter + divider;		
			}
		divider++;
		}
		
		if (counter == x){
			for(int j = 0;j<nums.length;j++){
			nums[j] = x;
			}
		}
		
		}
		
		return nums;
		}
		
	
		
	
	public static void main(String[] args) {
		
		
		//System.out.println(SumFacs(12));
		System.out.println(isPerf());
		

	}

}
