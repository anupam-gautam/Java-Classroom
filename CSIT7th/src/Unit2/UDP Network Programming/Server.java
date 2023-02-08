/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;
import java.net.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author Dell
 */
public class Server {
    public static void main(String[] args){
       try{
           
           DatagramSocket ds = new DatagramSocket(2000);
           byte []rec = new byte[Byte.MAX_VALUE];
           DatagramPacket dprec = null;
           System.out.println("Server Started");
           
           
           dprec = new DatagramPacket(rec, rec.length);
           ds.receive(dprec);
           String response = new String(dprec.getData());
           System.out.println("Repionse is: " + response);
       
       }
       catch(Exception e){
           System.out.println(e);
       }
        
    }
}
