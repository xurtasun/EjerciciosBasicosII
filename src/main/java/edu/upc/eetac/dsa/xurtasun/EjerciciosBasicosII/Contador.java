package edu.upc.eetac.dsa.xurtasun.EjerciciosBasicosII;

public class Contador {
	
	private int cont;
	
	public int getContador()
	{
		return cont;
	}
	
	public void setContador(int c)
	{
		try {Thread.sleep(1000);}
		
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		cont = c;
		
	}

}
