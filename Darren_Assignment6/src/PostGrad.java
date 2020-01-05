
public class PostGrad extends Student {

	private String supervisor;
	
	public PostGrad(String n, int id, int y, String p,String s) {
		super(n, id, y, p);
		supervisor = s;
	}


	public void display() {
		super.display();
		System.out.println("Supervisor: "+supervisor);
	}
	
	public static void main(String[] args) {
		PostGrad p = new PostGrad("Dave",4567,2,"DME","Dr. Wang");
		p.display();

	}

}
