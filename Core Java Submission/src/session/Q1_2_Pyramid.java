package session;

import java.util.Scanner;

public class Q1_2_Pyramid {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int rows,l=1;
	    System.out.println("Enter number of rows you want: ");
	    rows=sc.nextInt();
	    System.out.println("Pyramid pattern");
	    for(int i=1; i<=rows; i++)
	    {
	        for(int j=1; j<=rows-i; j++)
	        {
	            System.out.print(" ");
	        }
	        for(int k=1; k<=i; k++, l++)
	        {
	            System.out.print(l+" ");
	        }
	        System.out.println();
	    }

	}

}
