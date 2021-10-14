package lab;

class Outer
{ 
	int a=10;
	void displaya()
	{
		System.out.println("Value of a = "+a);
	}
	void createInner()
	{
		Inner inner=new Inner();
		inner.displayb();
	}
	class Inner
	{
		int b=20;
		void displayb()
		{
			displaya();
			System.out.println("Value of a = "+a+" Value of b = "+b);
		}
	}
}
class Unit6_4_InnerClassDemo {
	
		public static void main(String args[])
		{
			Outer outer = new Outer();
			outer.createInner(); 
		}


}
