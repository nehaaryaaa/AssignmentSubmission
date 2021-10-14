package lab;

import java.util.Scanner;

public class Unit2_1_Operators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice : ");
		System.out.println("1: Increment and decrement operators.\n2 : 2 Bitwise Complement Operator.\n3 : Arithmetic operator.\n4 : Relational Operator.\n5 : Bitwise operator.\n6 : Conditional Operator.");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:	int a = 11, b = 25;    
				System.out.println("Increment and Decrement Demo");
			    System.out.println ("a ="  + a);         
			    System.out.println ("b ="  +b);         
			    System.out.println ("++a =" +  ++a);      
			    System.out.println ("b++ ="  + b++);         
			    System.out.println ("a =" + a);         
			    System.out.println ("b =" + b); 
			    break;
		case 2: int  x = 8;  
				System.out.println("Bitwise Complement Operator Demo");
				System.out.println ("x  ="   + x);               
				int y  = ~x;               
				System.out.println ("y ="  + y);
				break;
		case 3: float  c = 63.5f,  d = 11.5f;           
				System.out.println ("c  ="  + c);           
				System.out.println ("d ="    + d);           
				System.out.println ("c + d ="  + ( c + d) ) ;           
				System.out.println ("c  - d ="   + (c - d)  ) ;        
				System.out.println ("c * d ="   +( c* d) );           
				System.out.println ("c / d ="   + ( c / d )  );           
				System.out.println ("c % d ="  + ( c  % d) ); 
				break;
		case 4: int e = 7, f = 11, z = 11;     
				System.out.println (" x=" + e);     
				System.out.println ("y =" + f);     
				System.out.println ("x < y =" + ( e < f ) );     
				System.out.println ("x > z ="   + (e > z)  );     
				System.out.println ("x <= z ="   + (f <= z)  );     
				System.out.println ("x >= y ="  + (e >= f ) );     
				System.out.println ("y == z =" + (f ==z) );     
				System.out.println ("x != z ="  +   (e != z)  ); 
				break;
		case 5: int  g = 5, h = 6;     
				System.out.println (" x =" +g);     
				System.out.println (" y =" + h );     
				System.out.println (" x & y ="   + ( g & h) ) ;     
				System.out.println (" x  |  y ="   + ( g  | h ) );     
				System.out.println (" x  ^ y ="    +( g ^ h)  );
				break;
		case 6: int  i  = 0;       
				boolean isEven  = false;       
				System.out.println ("x =" + i);              
				i = isEven ? 4: 7;              
				System.out.println ("x =" + i);
		}
		
	}

}
