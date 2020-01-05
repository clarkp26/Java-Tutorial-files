
import java.util.*;
import java.security.*;
interface Food {
	 public String getType();
	}
	class Pizza implements Food {
	 public String getType() {
	 return "Someone ordered a Fast Food!";
	 }
	}

	class Cake implements Food {

	 public String getType() {
	 return "Someone ordered a Dessert!";
	 }
	}
	class FoodFactory {
		public Food getFood(String order) {
		
			if(order.contentEquals("cake")){
			    Cake c =new Cake();
			    return c;
			    }
			else{
			    Pizza p = new Pizza();
			    return p;
			}
         }
	}

		




