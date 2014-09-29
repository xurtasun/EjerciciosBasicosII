package edu.upc.eetac.dsa.xurtasun.EjerciciosBasicosII;


public class ThreadsRunnable1
{
    public static void main( String[] args )
    {
    	ThreadsRunnableCLass tc1 = new ThreadsRunnableCLass(4,"ID1 ");
    	ThreadsRunnableCLass tc2 = new ThreadsRunnableCLass(7,"ID2 ");
    	ThreadsRunnableCLass tc3 = new ThreadsRunnableCLass(8,"ID3 ");
    	
    	new Thread(tc1).start();
    	new Thread (tc2).start();
    	new Thread (tc3).start();
    }
}
