package edu.upc.eetac.dsa.xurtasun.EjerciciosBasicosII;


public class CuentaAtras
{
    public static void main( String[] args )
    {
    	ThreadContador tc1 = new ThreadContador(4,"ID1 ");
    	ThreadContador tc2 = new ThreadContador(7,"ID2 ");
    	ThreadContador tc3 = new ThreadContador(8,"ID3 ");
    	
    	tc1.start();
    	tc2.start();
    	tc3.start();
    }
}
