package lab;

class MethodA
{
	int i, j;
	MethodA() 
	{
		i = 0;
		j = 0;
	}
	MethodA(int a, int b)  
	{
		i = a;
		j = b;
	}
	void show()
	{
		System.out.println ("i and j : "  +  i +"   "+ j);
	}
}
class MethodB extends MethodA 
{
	int  k; 
	MethodB()
	{
		i = 0;
		j = 0; 
		k = 0;
	}
	MethodB(int a, int b, int c) 
	{
		i = a;
		j = b;
		k = c; 
	}
	void show()
	{
		System.out.println( "i  and j : " + i +"  "  +   j  );   
		System.out.println  (" k : "  + k);
	}
} 
public class Unit4_4_Overriding {
	public static void main(String[] args) {
		MethodB b  = new MethodB( 1,2,3);  
		b.show() ;
	}

}
