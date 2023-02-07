
package NetworkProgramming;
import java.net.*;
import java.io.*;
public class Client {
   private Socket skt = null;
   private DataInputStream dis=null;
   private DataOutputStream dos = null;
   //constructor
   public Client(String address,int port){
      try{
          skt = new Socket(address,port); 
          System.out.println("client connected");
          dis = new DataInputStream(System.in);
          dos = new DataOutputStream(skt.getOutputStream());
//          String str="";
//          while(!str.equalsIgnoreCase("out")){
//             str = dis.readUTF();
//             dos.writeUTF(str);
//          }
      }catch(UnknownHostException u){
          System.out.println(u);
      }catch(IOException i){
          System.out.println(i);
      }
          try{
              String str="";
          while(!str.equals("out")){
             str = dis.readLine();
             dos.writeUTF(str);
             dos.flush();
          }
             dis.close();
             dos.close();
             skt.close();
          }catch(IOException i){
              System.out.println(i);
          }
          
          
      
       
       
   }
    public static void main(String[] args) {
        Client c1 = new Client("localhost",5000);
    }
}
