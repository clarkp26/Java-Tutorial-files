
import java.io.*;
import java.net.*;//Imports the libraries of the functions used

class TCPClient {// opens the client class

	public static void main(String argv[]) throws Exception {//opens the main of the code
		
		String TimeDate;//Declares variable for storing the time and date

		Socket clientSocket = new Socket("localhost", 1113);// connects to the server using its host name and portnumber

	
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(
				clientSocket.getInputStream())); // reads in text sent from the server


		TimeDate = inFromServer.readLine(); //puts the text sent from the server into the string variable

		System.out.println("FROM SERVER: " + TimeDate);// outputs the string in the client terminal

		clientSocket.close();//closes the connection

	}
}
