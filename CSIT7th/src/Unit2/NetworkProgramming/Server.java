package NetworkProgramming;
import java.net.*;
import java.io.*;
public class Server {
 private Socket skt = null;
 private ServerSocket server = null;
 private DataInputStream in = null;
 public Server (int port){
     try{
        server = new ServerSocket(port);
         System.out.println("server started");
         System.out.println("waiting for client");
         skt = server.accept();
         System.out.println("client accpeted");
         //taking input from client
         in = new DataInputStream(new BufferedInputStream(skt.getInputStream()));
         String ans="";
         while(!ans.equals("out")){
             ans=in.readUTF();
             System.out.println("Client says"+ans);
         }
     }catch(IOException i){
         System.out.println(i);
     }
         try{
             skt.close();
         in.close();
         }catch(IOException i){
             System.out.println(i);
         }
         
     
 }
    public static void main(String[] args) {
        Server s1 = new Server(5000);
    }
}
