
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.Date; // Imports libraries of the functions used

class TCPServer {// opens the Server class

	public static void main(String argv[]) throws Exception {// opens the server main

		ServerSocket welcomeSocket = new ServerSocket(1113);// Defines the servers port number

		while (true) {

			Socket connectionSocket = welcomeSocket.accept();//Accepts any connection to the portnumber

		
			DataOutputStream outToClient = new DataOutputStream(
					connectionSocket.getOutputStream()); // outputs a message to the client

			
			Calendar calendar = Calendar.getInstance();// creates a calender variable to obtain the current date
			Date d = calendar.getTime();// obtains the current date from the calender and stores it in the variable
			String date = d.toString();// converts the d variable to a string and stores it in a different variable

			outToClient.writeBytes(date + "\n");// outputs the string containing the date and time to the client
		}
	}
}

