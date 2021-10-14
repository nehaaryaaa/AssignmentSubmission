package lab;

class Box  
{
	private int length;
	private int breadth;  
	public Box ( ) 
	{
		length =0;
		breadth =0; 
	}
	public Box (int x, int y)
	{
		length = x;  breadth =y;
	}
	public void setval (int x, int y) 
	{
		length = x;  
		breadth = y;
	}
	public int area ( ) 
	{
		return (length * breadth);  
	}
} 
public class Unit9_2_Box extends Box{
	private int height; 
	public Unit9_2_Box ( )
	{
		super ( );
		height  = 0;  
	}
	public Unit9_2_Box(int x, int y, int z) 
	{
		super (x, y);
		height = z;
	}
	public void setval (int x, int y, int z)
	{
		super.setval(x, y);   
		height = z; 
	}
	public int volume ( )
	{
		return (super.area ( ) * height );
	} 
	public static void main(String[] args) {
		Box  b1 = new Box ( ); 
		Unit9_2_Box b2 = new Unit9_2_Box(12,34,18);   
		b1.setval (25,30);
		System.out.println ("The area of b1 is : " + b1.area( ) );
		System.out.println ("The volume of b2 is : "+ b2.volume ( ));
	}

}
