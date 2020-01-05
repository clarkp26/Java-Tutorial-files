
public class Q2d {

	public static boolean isBracketed(String n){
		int count1=0;
		int count2=0;
		char[] k= n.toCharArray();
		for(char c : k){
			if(c == '(' ){
				count1++;
			}
			if(c == ')'){
				count2++;
			}
		}
		if (count1==count2){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String n ="(()))";
		System.out.println(isBracketed(n));

	}

}
