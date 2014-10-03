package edu.upc.eetac.dsa.xurtasun.EjerciciosBasicosII;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Protocolo {

	private Date date = new Date();
	private SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	 public String processInput(String theInput) {
		 String theOutput = null;
		 
		 theOutput = fecha.format(date);
		 return theOutput;
	 }
}
