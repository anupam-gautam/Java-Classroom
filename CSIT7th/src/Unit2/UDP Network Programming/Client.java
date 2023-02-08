/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;
import java.net.*;
import java.io.*;
import java.util.*;


public class Client {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    try{
        DatagramSocket ds = new DatagramSocket();
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip);
        byte[] bstr = null;
        System.out.println("Client Started");
        System.out.println("Enter anything you like");
        String str1 = sc.nextLine();
        bstr = str1.getBytes();
        
        DatagramPacket dp = new DatagramPacket(bstr,bstr.length,ip, 2000);
        ds.send(dp);
        System.out.println("Request Sent");
    
    }
    catch(SocketException e){
        System.out.println("exceptioj");
    }
    catch(IOException e){
        System.out.println(e);
    }
}    
}
