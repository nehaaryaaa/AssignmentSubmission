package lab;


abstract class  Abstract1
{
	abstract void callme();
	void callmetoo()
	{
		System.out.println ("This is a concrete method .");
	}
}
class Abstract2 extends  Abstract1
{
	void callme()
	{
		System.out.println ("B’ s implementation of callme.");
	}
}
public class Unit5_2_AbstractClass {

	public static void main(String[] args) {
		Abstract2 b  = new Abstract2();    
		b.callme(); 
		b.callmetoo();
	}

}
