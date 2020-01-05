import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SimpleMap {

	public static  <T> void  printArray(T[] t){
		for(int i=0;i<t.length;i++) {
		System.out.println(t[i]);
		}
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Map<String,Integer> x = new HashMap<String,Integer>();
		x.put("Uncle Sam", 2334556);
		x.put("Tom",34565465);
		
		System.out.println(x.get("Tom"));
		System.out.println(x.get(2334556));
		
		Set<String> set = new HashSet<String>();
		String y = "Mary";
		String z = "Joe";
		String a = "James";
		set.add(z+" "+ a);
		set.add(y+" "+ a);
		set.add(a+" "+ z);
		set.add(z+" "+ a);
		System.out.println(set);
		int[] arr = {1,2,3};
		String[] arrtwo = {"tom","lee"};
//		printArray(arr);
//		printArray(arrtwo);
		if (y =="Mary") {
			System.out.println("It Works Lad");
		}
	}

}
