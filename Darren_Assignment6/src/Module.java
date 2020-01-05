
public class Module {

	public Module(String nn,String c) {
		mod_name = nn;
		mod_code = c;
	}
	private String mod_name,mod_code;
	
	public void display() {
		System.out.println("Module Name: "+mod_name+"\nModule Code: "+ mod_code);
	}
	
	public int lowercaseCount(String x) {
		if(x =="") {
			return 0;
		}
		char y = x.charAt(x.length()-1);
		v = shortened string
		if(y == y.toLowerCase()) {
			
			return 1 + lowercaseCount(v);
		}
		return lowercaseCount(v);
	}
	public static void main(String[] args) {
		
	}

}
