
public class Q6 {

//	private int count =0;
	
public static int[] lotteryNumbers(){
	int ans[] = new int[10];
	for (int i=0;i<10;i++){
	int x = (int)(Math.random()*((11-1)+1))+1;
	ans[i] = x;
	}
	return ans;
	
	
}
	
	public static void main(String[] args) {
		int[] results =lotteryNumbers();
		for (int i=0;i<results.length;i++){
			System.out.println(results[i]);
		}
	
	}
}


