package lab;

class SimpleObject {
	SimpleObject() 
	{
		System.out.println ("No argument Constructor Call");
	}
	SimpleObject(int a)   
	{
		System.out.println ("One argument Constructor Call");        
	}
}
public class Unit3_2_SimpleObject
{
	public static void main(String ars[])
	{
		new SimpleObject();            
		new SimpleObject(500);
	}
}
