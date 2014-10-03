package edu.upc.eetac.dsa.xurtasun.EjerciciosBasicosII;

import java.io.*;
import java.net.*;

public class Server {
	
	public static void main(String[] args) throws IOException 
	{
		 int portNumber = 2001;
		 
		 try ( 
		            ServerSocket serverSocket = new ServerSocket(portNumber);
		            Socket clientSocket = serverSocket.accept();
		            PrintWriter out =
		                new PrintWriter(clientSocket.getOutputStream(), true);
		            BufferedReader in = new BufferedReader(
		                new InputStreamReader(clientSocket.getInputStream()));
		        )
		    {
			 String inputLine, outputLine;
			 
			 Protocolo pro = new Protocolo();
			 outputLine = pro.processInput(null);
	         out.println(outputLine);
			 
	         while ((inputLine = in.readLine()) != null) 
	         {
	                outputLine = pro.processInput(inputLine);
	                out.println(outputLine);
	                if (outputLine.equals("Bye."))
	                    break;
	            }

		    } 
		 catch (IOException e) 
		 		{
		            System.out.println("Exception caught when trying to listen on port "
		                + portNumber + " or listening for a connection");
		            System.out.println(e.getMessage());
		        }
		 }
		
}
	


