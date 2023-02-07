
package NetworkProgramming;
import java.net.*;
import java.util.*;

public class DatagramSocketClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            DatagramSocket ds = new DatagramSocket();
            InetAddress ip = InetAddress.getLocalHost();
            byte []str = null;
            while(true){
                
            }
            
        }catch(SocketException s){
            System.out.println(s);
        }catch(UnknownHostException s){
            System.out.println(s);
        }
        
        
    }
}
