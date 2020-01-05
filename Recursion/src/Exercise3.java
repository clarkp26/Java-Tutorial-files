
public class Exercise3 {

	public static String rev(String s){
	/*//String[] k = s.split("(?!^)");
		s.substring(2);//Gets rid of the first char in string
		s.charAt(0);//takes the first char from the string and creates a new string
		(s.substring(1))+s.charAt(0)); //adds first letter from string to the back
		return "A";*/
		if ((s.length() <=1)||(null==s)){
			return s;
		}
		else
			return rev(s.substring(1)) +s.charAt(0);
	}
	
	public static void main(String[] args) {
		System.out.println(rev("CATDOG"));

	}

}
