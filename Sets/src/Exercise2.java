import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
	HashSet<String> unemployed  = new HashSet();
	HashSet<String> taxpayers = new HashSet();
	
	Scanner File1 =null;
	try {File1 = new Scanner(new File("C:/Users/Philip/OneDrive/Documents/text files/unemployed.txt"));}
	catch(FileNotFoundException e){};
	while (File1.hasNextLine()) {
		String l = File1.nextLine();
		unemployed.add(l);
	}
	
	Scanner File2 =null;
	try {File2 = new Scanner(new File("C:/Users/Philip/OneDrive/Documents/text files/taxpayers.txt"));}
	catch(FileNotFoundException e){};
	while (File2.hasNextLine()){
		String x = File2.nextLine();
		taxpayers.add(x);
	}
	System.out.println("Dodgy Characters");
for(String i: unemployed){	
	if (taxpayers.contains(i)){
		System.out.println(i);
	}
}
	}

}
