import java.sql.Time;


public class Date implements Comparable<Date>{

	private int month,year,day;
	
	public Date (int d,int m,int y){
		day=d;
		month=m;
		year=y;
	}
	
	public int compareTo(Date t){
		return (elapsedDays()-t.elapsedDays());
	}
	
	public String toString(){
		return day + " " + month + " " + year;
	}
	
	private int elapsedDays(){
		int days = (year-1900)*365 + (year-1901)/4;
		int k = 1;
		while(k<month){
			int daysInMonth;
			if (k==9||k==4||k==6||k==11){
				daysInMonth =30;
			}
			else if (k==2){
				if(year%4==0 && year!=1900){
					daysInMonth = 29;
				}
				else{
					daysInMonth = 28;
			}
			}
			else{
				daysInMonth = 31;
			}
			days = days+daysInMonth;
			k++;
		}
		return days + day;
	}
	
	public static void main(String[] args) {
		Date today = new Date(12,10,1996);
		Date x = new Date(4,5,1997);
		System.out.println(x.compareTo(today));

	}

}
