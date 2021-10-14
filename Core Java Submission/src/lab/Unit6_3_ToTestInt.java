package lab;

interface Test
{
	public int square(int a);
}
class Arithmetic implements Test  
{
	public int square(int b)
	{
		int s=0;
		s=b*b;
		System.out.println("Inside arithmetic class – implemented method    square");
		System.out.println("Square of "+b+ " is "+s);
		return s; 
	}
	void arithmetic() 
	{
		System.out.println("Inside method of class Arithmetic");
	}
}
public class Unit6_3_ToTestInt {

	public static void main(String[] args) {
		System.out.println("Calling from ToTestInt class main  method");
		Test t = new Arithmetic();
		System.out.println("==============================");
		System.out.println("Created object of test interface – reference Arithmetic class ");
		System.out.println("Hence Arithmetic class method square  called");
		System.out.println("This object cannot call armeth method of Arithmetic class");
		System.out.println("=================================");
		t.square(10); 
		System.out.println("=================================");  
	}

}
