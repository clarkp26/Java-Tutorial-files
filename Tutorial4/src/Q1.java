
public class Q1 {

	public static String Hello(String x){
		return "Hello " + x;
	}
	
	public static void main(String[] args) {
		String Names[] = {"Sam","Dave","Aidan","Chris"};
		for (int i=0;i<Names.length;i++){
		System.out.println(Hello(Names[i]));
		}
	}

}
