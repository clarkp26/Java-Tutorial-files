import java.util.Scanner;


public class Date {

	private int day, month, year;
	
	public Date(int aday, int amonth,int ayear){
		day = aday;
		year = ayear;
		month = amonth;
	}
	public Date(){}
	
	public void get() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Day: ");
		day = in.nextInt();
		System.out.println("Enter Month: ");
		month = in.nextInt();
		System.out.println("Enter Year: ");
		year = in.nextInt();
		
	}
	
	public void put() {
		System.out.println(day + "/" + month + "/" + year);
	}
	
	public boolean postDates(Date d){
		if(year > d.year){
			return true;
		}
		else if(year < d.year){
			return false;
		}
		else if (year == d.year){
			if (month > d.month){
				return true;
			}
			else if(month < d.month){
				return false;
			}
			else if(month == d.month){
				if(day > d.day){
					return true;
				}
				else if(day < d.day){
					return false;
				}
				else{
					return false;
			}
			
			}
		
		}
		
	return true;	
	}
	
	public static void main(String[] args) {
		Date today = new Date();
		Date tomorrow = new Date();
		Date nextday = new Date();
		
		today.get();
		tomorrow.get();
		nextday.get();
		if(today.postDates(tomorrow) == true){
			if(today.postDates(nextday) == true){
				today.put();
			}
			else{
				nextday.put();
			}
		}
		else{
			if(tomorrow.postDates(nextday) == true){
				tomorrow.put();
			}
			else{
				nextday.put();
			}
		}	
	}

}
