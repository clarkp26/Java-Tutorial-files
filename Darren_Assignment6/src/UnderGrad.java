
public class UnderGrad extends Student{

	private Module[] modules =new Module[3];
	
	public UnderGrad(String n, int id, int y, String p, Module[] m) {
		super(n, id, y, p);
		modules = m;
	}

	public void display() {
		super.display();
		for(int i=0;i<3;i++) {
			System.out.println("Module "+(i+1));
			modules[i].display();
		}
	}

	public static void main(String[] args) {
		Module x = new Module("Object Oriented Programming","EE219");
		Module y = new Module("Systems","EE777");
		Module z = new Module("Engineering Maths","EE502");
		Module[] modules = {x,y,z};
		UnderGrad person = new UnderGrad("Philip",1234,4,"ECE",modules);
		
		Module a = new Module("Embedded Systems","EE223");
		Module b = new Module("Biology","EE797");
		Module c = new Module("Engineering Maths","EE043");
		Module[] modulestwo = {a,b,c};
		UnderGrad persontwo= new UnderGrad("Darren",9876,3,"ME",modulestwo);
		
		PostGrad p = new PostGrad("Dave",4567,2,"DME","Dr. Wang");
		
		PostGrad q = new PostGrad("Steve",1092,3,"BME","Dr. Einstein");
		
//		Student[] sa = new Student[4];
//		for(int i=0;i<4;i++) {
//			
//		}
		Student[] sa = {person,persontwo,p,q};
		for(int i=0;i<4;i++) {
			sa[i].display();
		}
//		person.display();
//		persontwo.display();
//		p.display();
//		q.display();



	}

}
