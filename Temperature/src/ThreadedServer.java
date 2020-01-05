import java.net.ServerSocket;
import java.net.*;
import java.io.*;

public class ThreadedServer 
{
    private static int portNumber = 5050;
    
    
    public static void main(String args[]) {
      
    	
      
        // Server is now listening for connections or would not get to this point
        while (true) // almost infinite loop - loop once for each client request
        {
        	ServerSocket clientSocket = new ServerSocket(portNumber);
            try{
                System.out.println("**. Listening for a connection...");
                clientSocket = ServerSocket.accept();
                System.out.println("00. <- Accepted socket connection from a client: ");
                System.out.println("    <- with address: " + clientSocket.getInetAddress().toString());
                System.out.println("    <- and port number: " + clientSocket.getPort());
            } 
            catch (IOException e){
                System.out.println("XX. Accept failed: " + portNumber + e);
                listening = false;   // end the loop - stop listening for further client requests
            }        
            
            ThreadedConnectionHandler con = new ThreadedConnectionHandler(clientSocket);
            con.start(); 
            ...
        }
}
}