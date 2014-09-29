package edu.upc.eetac.dsa.xurtasun.EjerciciosBasicosII;

public class ThreadsRunnableCLass2 {
	
	private int cont;
	private String name;
	
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
	public void setName(String n)
	{
		name= n; 
	}
	
	public String getName()
	{
		return name;
	}

}
