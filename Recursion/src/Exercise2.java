
public class Exercise2 {
static int count =0;
	public static int sum(int n){
		int x=n%10;
		if(x==0){
			return count;
		}
		else count = count +x;
		return sum(n/10);
		
	}
	public static void main(String[] args) {
		System.out.println(sum(43567));
	}

}
