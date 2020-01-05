
public class Q6 {

	public static int[] lotteryNumbers() {
		int[] nums = new int[7];
		for (int i =0;i<5;i++) {
			nums[i] = (int) (Math.random()* 50) + 1;
		}
		for (int i =5;i<7;i++) {
			nums[i] = (int) (Math.random()*11)+1;
		}
		return nums;
		
	}
	public static void main(String[] args) {
		int[] x = lotteryNumbers();
		for(int i=0;i<7;i++) {
			System.out.println(x[i]);
		}

	}

}
