
public class Test {

		private static int maximum(int[] w) { // max in w
			final int repeat = 10000; // no of repetitions
			int max=0; int k;
			for (k=0; k<repeat; k++) { //repeated for timing 
				max = w[0]; int i=1; 
				while (i<w.length) {
					if (w[i]>max)max = w[i];        
					i++;
				}
			}
			return(max);
		}

	public static void main(String[] args) {
		int[] w = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(maximum(w));

	}
}

