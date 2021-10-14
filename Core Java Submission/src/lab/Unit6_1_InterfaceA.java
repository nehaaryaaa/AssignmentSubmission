package lab;

interface AA
{
	void meth1(); 
	void meth2();
}
class MyClass implements AA     
{
	public void meth1 ( )
	{
		System.out.println("Implementation of  meth1().");
	}
	public void meth2()
	{
		System.out.println ("Implement meth2().");
	}
}
public class Unit6_1_InterfaceA 
{
	   public static void main(String args[])
	   {
		   MyClass ob = new MyClass();     
		   ob.meth1();
		   ob.meth2();
	   }
}

