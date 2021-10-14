package lab;

import java.util.Scanner;

public class Unit10_1_Negative {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try  
		{
			System.out.println("Enter the length of array : ");
			int n=sc.nextInt();
			int a1[] = new int[n]; 
			System.out.println("First element : "+a1[0]);
		}
		catch(NegativeArraySizeException n) 
		{
			System.out.println("Exception : " + n);  
		}
		System.out.println("After try block");
	}

}
