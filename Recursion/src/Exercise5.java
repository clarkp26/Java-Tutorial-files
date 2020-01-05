
public class Exercise5 {
	private static int count=0;
	private static String h = "catdog";
	private static char[] letters;
	 
	
	public static boolean isPalindrome(String s){
		/*int size = s.length();
		for (int i=0;i<s.length();i++){
			letters[i] = s.charAt(i);
		}*/
		
		String w = s.substring(1)+s.charAt(0);
		System.out.println(w);
		if(h.equals(w)){
			return true;
		}
		else{
		count++;
		System.out.println(count);
		//String w =s.substring(1) + s.charAt(0);
		if (count!=w.length()){
		return isPalindrome(s.substring(1)) + s.charAt(0);
		}
		return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome(h));

	}

}
