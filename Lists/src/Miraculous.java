//import java.util.Collections;
import java.util.*;
import java.lang.Object;
import java.lang.Number;
import java.lang.Long;
import java.util.List;


public class Miraculous {

	ArrayList<Long> list = new ArrayList<>();
	
	public long checkMiraculous(long x){
		
		if((x/100000000)%2==0){
			if((x/10000000)%3==0){
				if((x/1000000)%4==0){
					if((x/100000)%5==0){
						if((x/10000)%6==0){
							if((x/1000)%7==0){
								if((x/100)%8==0){
									if((x/10)%9==0){
										if(x%10==0){
											System.out.println("Miraculous Number is: " + x);
											return x;
										}
									}
								}
						    }
						}
					}
				}
			}
		}
		else 
			if (list.size() == 0){
				long d = 1000000000;
				long z = 0;
		for (int i=0;i<10;i++){
			z = x/d;
			x = x-(z*d);
			d=d/10;
			list.add(z);
			
		}	
			}
		
		Collections.shuffle(list);	
		//System.out.println(list);
		long m = 1;
		long y = 0;
		for(long t : list){		
			long n = t*m;
			y=y+n;
			m=m*10;	
		}
			
		//System.out.println(y);
		return checkMiraculous(y);
		
		/*System.out.println("AYE");
		return 0;*/
	}

	public static void main(String[] args) {
		//ArrayList<Long> list = new ArrayList<>();
		Miraculous p = new Miraculous();
		long b = 1234567890L;
		p.checkMiraculous(b);
	}
}
