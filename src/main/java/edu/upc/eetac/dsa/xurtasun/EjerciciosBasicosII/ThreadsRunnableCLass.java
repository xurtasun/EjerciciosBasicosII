package edu.upc.eetac.dsa.xurtasun.EjerciciosBasicosII;

public class ThreadsRunnableCLass implements Runnable{
	
	private ThreadsRunnableCLass2 c = new ThreadsRunnableCLass2();
	private int cuenta;
	private static String LastName;
	
	public ThreadsRunnableCLass( int cuenta, String nombre)
	{
		this.c.setName(nombre);
		this.cuenta = cuenta;
		this.c.setContador(cuenta);
		
	}
	
	public void run()
	{
		
		for (int i = 0; i< cuenta; i++)
		{
			LastName = c.getName();
			int valor = c.getContador();
			
			System.out.println("El Thread "+ c.getName() + "disminuye el contador a " + c.getContador()+ " Escritura "+ LastName);
			c.setContador(valor-1);
		}
	}

}
