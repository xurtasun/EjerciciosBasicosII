package edu.upc.eetac.dsa.xurtasun.EjerciciosBasicosII;

public class ThreadContador extends Thread{
	
	private Contador c = new Contador();
	private int cuenta;
	
	public ThreadContador( int cuenta, String nombre)
	{
		super (nombre);
		this.cuenta = cuenta;
		this.c.setContador(cuenta);
	}
	
	public void run()
	{
		for (int i = 0; i< cuenta; i++)
		{
			int valor = c.getContador();
			
			System.out.println("El Thread "+ Thread.currentThread().getName() + "disminuye el contador a " + c.getContador());
			c.setContador(valor-1);
			
			Thread.activeCount();
		}
	}

}
