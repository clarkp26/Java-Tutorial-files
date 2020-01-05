
public class Exercise5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sentence = "ack well sure yano a yourself big lad thats the way it goe hi apjhgvfc ygfddd bhgffr";
        int[] counter = new int[19];
        String[] wordCount = sentence.split(" ");
        
        for(int i=0;i<wordCount.length;i++){
        	     int x = wordCount[i].length();
        	     
        	    		 counter[x-1]++;
        	    	 }
        for(int i=0;i<19;i++)
        System.out.println(counter[i]);
        	     }
        	    	 
        	     }
  	


