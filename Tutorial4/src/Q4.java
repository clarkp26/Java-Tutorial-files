
public class Q4 {

	public static String nTwice(String x,int y){
		String letters[] = x.split("");
		String ans = "";
		int counter = 0;
		int counter2 = (x.length())-y;
		while(counter < y){
			ans = ans + letters[counter];
			counter++;
		}
		while(counter2 < x.length()){
			ans =ans + letters[counter2];
			counter2++;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(nTwice("Hello",2));
		System.out.println(nTwice("Chocolate",3));
		System.out.println(nTwice("Chocolate",1));
		}
	}


