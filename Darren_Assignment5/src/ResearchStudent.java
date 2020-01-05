
	public class ResearchStudent extends Student{

		private String supervisor, thesisTitle;
		
		public ResearchStudent() {}
		
//		public ResearchStudent(String n, int y, String p, String s, String t) {
//			super(n, y, p);
//			supervisor = s;
//			thesisTitle = t;
//		}
		public void display() {
			super.display();
			System.out.println("Supervisor: "+ supervisor + "\nThesis Title: " + thesisTitle);
		}
	}
