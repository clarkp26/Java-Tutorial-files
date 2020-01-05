
public class Q3 {

	public static boolean HasBad(String x){
		String letters[] = x.split("");
//			for(int i=0;i<letters.length;i++){
//				System.out.println(letters[i]);
//			}
		System.out.println(letters[0]);
		if (letters[0].contains("b")|| letters[1].contains("b")){
			return true;
		}
		else return false;
		
	}
	public static void main(String[] args) {
		System.out.println(HasBad("xbadxx"));
		System.out.println(HasBad("xxbadxx"));
		System.out.println(HasBad("badxx"));

	}

}
