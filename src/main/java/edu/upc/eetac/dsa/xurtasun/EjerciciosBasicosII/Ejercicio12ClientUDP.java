package edu.upc.eetac.dsa.xurtasun.EjerciciosBasicosII;


import java.io.*;
import java.net.*;

//This application sends a request to the QuoteServer, waits for the response, and, 
//when the response is received, displays it to the standard output.

public class Ejercicio12ClientUDP {
    public static void main(String[] args) throws IOException {
      

            // get a datagram socket
        DatagramSocket socket = new DatagramSocket();
        String hostName = "10.89.52.206";
            // send request
        byte[] buf = new byte[256];
        
        
       // InetAddress address = hostName;
       
        InetAddress address = InetAddress.getByName(hostName);
        
        DatagramPacket packet = new DatagramPacket(buf, buf.length,  address, 4445);
        socket.send(packet);
    
            // get response
        packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);

	    // display response
        String received = new String(packet.getData(), 0, packet.getLength());
        System.out.println("texto recibido: " + received);
    
        socket.close();
    }
}