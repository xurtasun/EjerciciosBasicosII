package edu.upc.eetac.dsa.xurtasun.EjerciciosBasicosII;

//contains a single method: the main method for the quote server application. 
//The main method simply creates a new QuoteServerThread object and starts it

import java.io.*;

public class Ejercicio12ProtocolUDP {
  public static void main(String[] args) throws IOException {
      new Ejercicio12ServerUDP().start();
  }
}
