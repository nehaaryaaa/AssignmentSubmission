package lab;

import java.util.Scanner;

class CallByValue  
{
	void value(int i, int j)
	{
		i *=2;
		j /=2;  
	}
}
class CallByReference 
{
	int a, b;
	CallByReference(int i, int j) 
	{
		a  = i; 
		b  = j;    
	}
	void ref(CallByReference o)
	{
		o.a *=2;  
		o.b /= 2;
	}
}
public class Unit3_3_CallValueReference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1 : Call By Value");
		System.out.println("2 : Call By Reference");
		System.out.println("Enter your choice : ");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1: System.out.println("Call By Value Demo ");
				CallByValue ob = new CallByValue();
				int a =15, b = 20;
				System.out.println ("Before call  : a = "+ a +" b = "+ b);     
				ob.value (a, b ); 
				System.out.println ("After call : a = " + a+" b = "+ b );
				break;
		case 2: System.out.println("Call By Reference Demo ");
				CallByReference ob1 = new CallByReference(15,20);  
				System.out.println("Before call : a  = "+ob1.a+" b ="+ob1.b);  
				ob1.ref (ob1); 
				System.out.println("After call : a*2 = "+ob1.a+" b/2 = "+ ob1.b); 
		}
	}

}
