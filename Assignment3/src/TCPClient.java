
import java.io.*;
import java.net.*;//imports all the libraries for use in the code

class TCPclient {// opens the client class
	
	@SuppressWarnings({ "deprecation"}) // gets rid of readLine() error
	public static void main(String argv[]) throws Exception {
		
		String function;
		String reply1;
		String Entry;
		int lines = 2;
		String reply2; //variables being declared
        
		
		Socket clientSocket = new Socket("localhost", 1342); //Server name and port number
		
		
		BufferedReader inFromUsera = new BufferedReader(new InputStreamReader(System.in)); // reads in lines from the client
		BufferedReader inFromUserb = new BufferedReader(new InputStreamReader(System.in)); // reads in lines from the client
		

		

		DataOutputStream outToServera = new DataOutputStream(clientSocket.getOutputStream()); // outputs messages to the server
		DataOutputStream outToServerb = new DataOutputStream(clientSocket.getOutputStream()); // outputs messages to the server
		
		BufferedReader inFromServera = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));//reads in messages from the server
		DataInputStream inFromServerb = new DataInputStream(clientSocket.getInputStream());//reads in messages from the server
		System.out.println("Write the function you want to use: \n");
		System.out.println("server_is");
		System.out.println("server_put");
		System.out.println("server_get");
		System.out.println("server_quit");
		System.out.println(""); // list of functions printed on the client terminal
		

		function = inFromUsera.readLine(); // reads in text from the client and puts it in the String variable
		outToServera.writeBytes(function + '\n'); // outputs the String to the server
        reply1 = inFromServera.readLine(); // reads in text from the server and puts it in the String variable
        System.out.println(reply1);// prints the string in the client terminal
		
		
        if (function.contains("server_is") == true){ //checks if the server_is command is used
        	
        for (int i = 0; i < lines; i++){//loops through the array of strings
        	
        	reply2 = inFromServerb.readLine();// reads in text from the server and puts it in the String variable
		    System.out.println(reply2); // outputs each string
		}
	}
        
        if (function.contains("server_put") == true){ //checks if the server_put command is used
    		
    		Entry = inFromUserb.readLine(); // reads in text from the client and puts it in the String variable
    	    outToServerb.writeBytes(Entry + "\n");// outputs the String to the server
    	    reply2 = inFromServerb.readLine();// reads in text from the server and puts it in the String variable
		    System.out.println(reply2); // outputs each string
        }

        if (function.contains("server_get") == true){ //checks if the server_get command is used
    		
    		Entry = inFromUserb.readLine(); // reads in text from the client and puts it in the String variable
    	    outToServerb.writeBytes(Entry + "\n");// outputs the String to the server
    	    reply2 = inFromServerb.readLine();// reads in text from the server and puts it in the String variable
		    System.out.println(reply2); // outputs each string
        }
        
        if (function.contains("server_quit") == true){ //checks if the server_quit command is used
    	    reply2 = inFromServerb.readLine();// reads in text from the server and puts it in the String variable
		    System.out.println(reply2); // outputs each string
		    clientSocket.close();//closes the connection
        }
        
		clientSocket.close();//closes the connection

	}
}


