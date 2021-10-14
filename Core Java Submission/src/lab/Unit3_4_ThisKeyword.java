package lab;

public class Unit3_4_ThisKeyword {
	int x;
	int y;
	private int i = 0;
	Unit3_4_ThisKeyword(){}
	Unit3_4_ThisKeyword( int   x, int  y) 
	{
		this.x = x;
		this.y = y;
	}
	void displayPoint()
	{
		System.out.println ("The x value is " + x);
		System.out.println ("The y value is "  + y);
	}
	void returnDisplay()
	{
		System.out.println ("The  i value is "  + i);
	}
	Unit3_4_ThisKeyword increment()  
	{  
		i++;
		return this ;
	}
	public static void main( String arg[]) 
	{ 
		System.out.println("Use of this keyword");
		Unit3_4_ThisKeyword t   = new Unit3_4_ThisKeyword(10,20);         
		t. displayPoint( );   
		System.out.println("\nUse of this object in return statement");
		Unit3_4_ThisKeyword t1   = new Unit3_4_ThisKeyword();         
		t1.increment().increment().increment().increment().returnDisplay(); 
	}

}
