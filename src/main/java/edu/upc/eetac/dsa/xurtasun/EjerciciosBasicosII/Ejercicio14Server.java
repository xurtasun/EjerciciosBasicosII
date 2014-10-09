package edu.upc.eetac.dsa.xurtasun.EjerciciosBasicosII;

import java.net.*;
import java.io.*;

public class Ejercicio14Server {
    public static void main(String[] args) throws IOException {
        
     

        int portNumber = 3000;

        try ( 
            ServerSocket serverSocket = new ServerSocket(portNumber);
            Socket clientSocket = serverSocket.accept();
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader( new InputStreamReader(clientSocket.getInputStream()));
        ) {
        
            String inputLine, outputLine;
            
            // Initiate conversation with client
            Ejercicio14Protocol E11 = new Ejercicio14Protocol();
          
            outputLine = E11.processInput(null);
            out.println(outputLine);

            while ((inputLine = in.readLine()) != null) { 
            	outputLine = E11.processInput(inputLine);
                out.println(outputLine);
                if (outputLine.equals("Bye."))
                    break;
            } 
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port " + portNumber + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }
}


