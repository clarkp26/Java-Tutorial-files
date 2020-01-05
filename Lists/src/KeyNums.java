import java.util.*;

public class KeyNums {
	
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();

		for (int i=0;i<10;i++){
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		nums.add(x);
		}
		for (int k: nums){
			if(k%2==0){
		System.out.print(k+",");
			}
		}
		for (int k: nums){
			if(k%2!=0){
		System.out.print(k +",");
			}
		}
	}

}
