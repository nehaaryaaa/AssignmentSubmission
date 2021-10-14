package lab;

class Super1 
{
	int i,  j; 
	Super1() 
	{
		i = 0;
		j =  0;
	}
	Super1(int a, int b)   
	{
		i = a; 
		j = b ;
	}
	void show()
	{
		System.out.println  ("i and  j : "+ i +" " + j); 
	}
}
class Super2 extends Super1  
{    
	int  k; 
	Super2()
	{
		super();
		k = 0;
	}
	Super2(int a, int b, int c)
	{
		super(a, b);
		k = c;
	}
	void show() 
	{
		super.show();
		System.out.println("k : " + k);     
	}
}
public class Unit4_5_SuperKeyword {

	public static void main(String[] args) {
		Super2 b  = new Super2( 11, 12, 13 );           
		b.show();
	}

}
