package lab;

class A  
{
	int i, j;
	void showij()
	{ 
		System.out.println ("  i and j: "  + i +" " + j ); 
	}
}
class B extends A
{
	int k;
	void showk()
	{
		System.out.println  ( "K:  "  + k); 
	}
	void sum()
	{
		System.out.println  (" i +  j  + k = " + ( i + j + k ) );
	}
}
public class Unit4_3_Inherit {

	public static void main(String[] args) {
		A a  = new A();      
		B b  = new B();
		a.i    = 40; 
		a.j   = 20;    
		System.out.println("Contents of super Object :");         
		a.showij()  ;     
		System.out.println();
		b. i = 1;       
		b. j = 2;   
		b. k = 3;      
		System.out.println  ("Contents of subclass object :"  ); 
		b.showij ( ) ; 
		b.showk ( );   
		System.out.println ( );
		System.out.println ("Sum of i, j and k in Sub Class Obj :" );
		b.sum ( ); 
	}

}
