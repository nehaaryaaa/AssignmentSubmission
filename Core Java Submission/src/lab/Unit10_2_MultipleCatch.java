package lab;

import java.util.Scanner;

public class Unit10_2_MultipleCatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter num1 : ");
			int a=sc.nextInt();
			System.out.println("Enter num2 : ");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("Quotient = "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurred");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid Data Format");
		}
		catch(Exception e)
		{
			System.out.println("Exception Occurred");
		}
	}

}
