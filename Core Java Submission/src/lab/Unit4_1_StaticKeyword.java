package lab;

public class Unit4_1_StaticKeyword {
	static int a=5;
	static int b;
	static void fun(int x)
	{
		System.out.println ("x = " +x);
		System.out.println ("a = " +a);
		System.out.println ("b = " +b);
	}
	static
	{
		System.out.println ("Static block Initialized");
		b = a * 5;
	}
	public static void main (String args [ ])
	{
		Unit4_1_StaticKeyword.fun(10);
	}
}
