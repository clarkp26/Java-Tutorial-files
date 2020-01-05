import java.net.*;

public class NetApplication1 {

        public static void main(String[] args) {
                try{
                        InetAddress localAddress = InetAddress.getLocalHost();
                        String hostname = localAddress.getHostName();
                        String address = localAddress.getHostAddress();
                        System.out.println("Your host has name: " + hostname + " and address: " + address);
                }
                catch (UnknownHostException e){
                        System.out.println("Cannot detect localhost : " + e.toString());
                }
        }

}
