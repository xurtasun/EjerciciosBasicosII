package edu.upc.eetac.dsa.xurtasun.EjerciciosBasicosII;

import java.text.SimpleDateFormat;
import java.util.*;

public class Ejercicio14Protocol {

	 	private static final int WAITING = 3;
	    private static final int SENTKNOCKKNOCK = 1;
	    private int state = WAITING;

	
    public String processInput(String theInput) {
        String theOutput = null;

        System.out.println("------");
 
      	 if (state == WAITING) {
             theOutput = "Hola, que número quieres, el 0 o el 1 ??";
             state = SENTKNOCKKNOCK;
         } else if (state == SENTKNOCKKNOCK) {
             if (theInput.equalsIgnoreCase("1")) {
            	 
            	  SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy kk:mm:ss") ;
            	   	 theOutput = fecha.format(new Date());
            	 
             } else {
            	 SimpleDateFormat fecha = new SimpleDateFormat("EEEE MMMM d HH:mm:ss z yyyy", Locale.UK) ;
              	 theOutput = fecha.format(new Date());
             }
         }
      
        
        return theOutput;
    }
}
