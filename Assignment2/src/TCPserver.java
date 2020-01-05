
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket; //all the relevant libraries were imported for the functions used

class TCPserver { //opens a new class

	public static void main(String argv[]) throws Exception { //opens the main of the class
		String InitialMessage; // variable for first message being received from the client
		String path = "C:/Users/Philip/OneDrive/Documents/New folder/Numbers.txt";// Variable indicating the location of the text file
		String path1 = "C:/Users/Philip/OneDrive/Documents/New folder/Number.txt";// Variable indicating the location of the text file
		
		
		FileReader fr = new FileReader(path); // variable fr for reading in information from the text file
		BufferedReader NameReader = new BufferedReader(fr); //reads each line of the text file
		
		int lines = 4; // variable for the amount of lines in the text file
		String[] NameNumber = new String[lines]; // array for the the amount of lines in the text file
		
		for (int i = 0;i<lines; i++){ // loop for going reading each line of the text file
			NameNumber[i] = NameReader.readLine(); // puts each line of the text file into a position in the array
		}
		

		ServerSocket welcomeSocket = new ServerSocket(1342); // socket port for connection to the server

		while (true) {// loop for code to run while the server is connected

			Socket connectionSocket = welcomeSocket.accept(); // connects the server to the client

			
			 BufferedReader inFromClienta = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream())); // first input from the client 
			 BufferedReader inFromClientb = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream())); // second input from the client
			 
			DataOutputStream outToClienta = new DataOutputStream(connectionSocket.getOutputStream()); // first output from the server
			DataOutputStream outToClientb = new DataOutputStream(connectionSocket.getOutputStream()); // second output from the server
			
			

			InitialMessage = inFromClienta.readLine(); // reads message from client into the variable
			
			
			if (InitialMessage.contains("server_1s") == true){ // checks if the variable is server_1s and runs the if statement if it is
				String x = "Here is the list of files: "; // string variable containing message to be outputted
				
				outToClienta.writeBytes( x + "\n");// outputs the string to the client
				/*String NewNameNumber = inFromClientb.readLine();// reads in the new name and number sent in from the client
				PrintWriter pr = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));// defines a new printwriter to write information directly to the text file
				pr.println("  \n");// move the printing to a new line in the text file
				pr.println(NewNameNumber + " \n");// prints the new name and number into the text file
				lines++; //increments the number of lines now in the text file*/
				
				for (int i=0;i<lines;i++)
				{
					outToClientb.writeBytes(NameNumber[i] + "\n"); // outputs the string to the the client
					
				}
				String l = "List of files transfered successfully"; // string variable with message to be outputted
				outToClientb.writeBytes(l + "\n"); // outputs the string to the the client
				//pr.close(); // closes the printwriter
			
			
			
			/*if (InitialMessage.contains("INSERT") == true){ // checks if the variable is INSERT and runs the if statement if it is
				String x = "Add in the name and number you want:"; // string variable containing message to be outputted
				
				outToClienta.writeBytes( x + "\n");// outputs the string to the client
				String NewNameNumber = inFromClientb.readLine();// reads in the new name and number sent in from the client
				PrintWriter pr = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));// defines a new printwriter to write information directly to the text file
				pr.println("  \n");// move the printing to a new line in the text file
				pr.println(NewNameNumber + " \n");// prints the new name and number into the text file
				lines++; //increments the number of lines now in the text file
				String l = "Name and number added successfully"; // string variable with message to be outputted
				outToClientb.writeBytes(l + "\n"); // outputs the string to the the client
				pr.close(); // closes the printwriter
			}
			
			if (InitialMessage.contains("CHECK") == true) //Checks if the Variable is CHECK and runs the if statement
			{
				String y = "Enter the person's name: "; // string variable containing message to be outputted
				outToClienta.writeBytes(y + "\n");// outputs the string to the client
				String NameEntered = inFromClientb.readLine();// reads in the new name and number sent in from the client
			for (int j=0;j<lines; j++)
			{
				if (NameNumber[j].contains(NameEntered) == true)// loops through the array storing the text file lines and checks if any of them match the name entered matches the
				{
					outToClientb.writeBytes(NameNumber[j] + "\n"); // outputs the name and number of the name entered
				}
			}
			}
			
			if (InitialMessage.contains("DELETE") == true){//Checks if the Variable is CHECK and runs the if statement 
				String kk = "Enter the person's name and number  you'd like to delete: ";// string variable containing message to be outputted
				outToClienta.writeBytes(kk + "\n");// outputs the string to the client
				
				File f = new File(path);//creates variable for where file is stored
				f.delete();// deletes original file
				File tempFile = new File(path1);//creates new temp file
				
				
				//f.createNewFile();// creates new empty file at same address
				PrintWriter lr = new PrintWriter(new BufferedWriter(new FileWriter(f, true)));//creates new printwriter variable 
				String ForDeleting = inFromClientb.readLine();// reads in the  name and number to be deleted in from the client
				
				for (int k = 0; k<lines; k++)
				{
					if (NameNumber[k].equals(ForDeleting) == false)// checks though the array for what names and numbers don't match the one we want to delete
					{
						lr.println(NameNumber[k] + "\n");// prints the new names and numbers into the new text file
						
					}
				}
				lr.close();// closes the printwriter 
				
				
				tempFile.renameTo(f);// renames temp file to original file name
		
				String xx = "Name and Number successfully deleted. ";// string with confirmation message
				outToClientb.writeBytes(xx + "\n");// outputs confirmation message to the client
				lines--;// decrements the line number by one
			}
			
				if (InitialMessage.contains("CHANGE") == true){//Checks if the Variable is CHECK and runs the if statement 
					String dd = "Enter the person's name whose number  you'd like to Change: ";// string variable containing message to be outputted
					outToClienta.writeBytes(dd + "\n");// outputs the string to the client
					
					File f = new File(path);//creates variable for where file is stored
					f.delete();// deletes original file
					File tempFile = new File(path1);//creates new temp file
					
					PrintWriter Dr = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));//creates new printwriter variable 
					String ForChanging = inFromClientb.readLine();// reads in the  name and number to be changed in from the client
					Dr.println(ForChanging + "/n");
					String[] splitup = ForChanging.split(" ");
					
					
					for (int l = 0; l<lines; l++)
					{
						if (NameNumber[l].contains(splitup[0]) == false)// checks though the array for what names and numbers don't match the one we want to delete
						{
							Dr.println(NameNumber[l] + "\n");// prints the new names and numbers into the new text file
							
						}
					}
					tempFile.renameTo(f);// renames temp file to original file name
					String yy = "Number successfully Changed. ";// string with confirmation message
					outToClientb.writeBytes(yy + "\n");// outputs confirmation message to the client
					Dr.close();// closes the printwriter 
				
				
			}*/
		}
	}
	}
}

