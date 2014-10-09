package edu.upc.eetac.dsa.xurtasun.EjerciciosBasicosII;




//creates a DatagramSocket on port 4445 (arbitrarily chosen). 
//This is the DatagramSocket through which the server communicates with all of its clients.

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;


public class Ejercicio12ServerUDP extends Thread {

    protected DatagramSocket socket = null;

    public Ejercicio12ServerUDP() throws IOException {
	this("Ejercicio12ServerUDP");
    }

    public Ejercicio12ServerUDP(String name) throws IOException {
        super(name);
        socket = new DatagramSocket(4445);//puerto
        
    }

    public void run() {

    	 String theOutput = null;

         SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy kk:mm:ss") ;
       	 theOutput = fecha.format(new Date());
    	
            try {
            	
            	byte[] buf = new byte[256];
            	
                // receive request
                DatagramPacket packet = new DatagramPacket(buf, buf.length);//creamos datagrama
                socket.receive(packet);//llenas el buffer

                // figure out response
                buf = theOutput.getBytes("US-ASCII");
                
                // send the response to the client at "address" and "port"
                InetAddress address = packet.getAddress();
                int port = packet.getPort();
                packet = new DatagramPacket(buf, buf.length, address, port);//nuevo paquete
                socket.send(packet);
            } catch (IOException e) {
                e.printStackTrace();

        }
        socket.close();
    }

  
}