

import java.io.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.*;//imports all the libraries for use in the code

class TCPclient {// opens the client class

	public static void main(String argv[]) throws Exception {
		String function;
		String reply1;
		String Entry;
		String reply2; //variables being declared

		Socket clientSocket = new Socket("localhost", 1342); //Server name and port number
		
		
		BufferedReader inFromUsera = new BufferedReader(new InputStreamReader(System.in)); // reads in lines from the client
		BufferedReader inFromUserb = new BufferedReader(new InputStreamReader(System.in)); // reads in lines from the client
		

		

		DataOutputStream outToServera = new DataOutputStream(clientSocket.getOutputStream()); // outputs messages to the server
		DataOutputStream outToServerb = new DataOutputStream(clientSocket.getOutputStream()); // outputs messages to the server
		
		BufferedReader inFromServera = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));//reads in messages from the server
		BufferedReader inFromServerb = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));//reads in messages from the server
		
		System.out.println("Write the function you want to use: \n");
		System.out.println("server_1s");
	
		System.out.println(""); // list of functions printed on the client terminal
		

		function = inFromUsera.readLine(); // reads in text from the client and puts it in the String variable
		outToServera.writeBytes(function + '\n'); // outputs the String to the server
        reply1 = inFromServera.readLine(); // reads in text from the server and puts it in the String variable
        System.out.println(reply1);// prints the string in the client terminal
		
		/*Entry = inFromUserb.readLine(); // reads in text from the client and puts it in the String variable
		outToServerb.writeBytes(Entry + "\n");// outputs the String to the server*/
		reply2 = inFromServerb.readLine();// reads in text from the server and puts it in the String variable
		System.out.println(reply2);// prints the string in the client terminal
		
		

		clientSocket.close();//closes the connection

	}
}


