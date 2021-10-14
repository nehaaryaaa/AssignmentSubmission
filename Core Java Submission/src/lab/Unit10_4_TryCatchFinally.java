package lab;

import java.util.Scanner;

public class Unit10_4_TryCatchFinally {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("In try block");
			System.out.println("Enter num1 : ");
			a=sc.nextInt();
			System.out.println("Enter num2 : ");
			b=sc.nextInt();
			c=a/b;
			System.out.println("Quotient = "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Caught : "+e);
		}
		finally
		{
			System.out.println("In finally - will always execute ");
		}
		System.out.println("After finally block");
	}

}
