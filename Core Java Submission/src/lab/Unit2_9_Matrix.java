package lab;

import java.util.Scanner;

public class Unit2_9_Matrix {
	void addition(int n,int a[][],int b[][])
	{
		int ADD[][]=new int[n][n];
		System.out.println("Addition is ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				ADD[i][j]=a[i][j]+b[i][j];
				System.out.print(ADD[i][j]+" ");
			}
			System.out.println();
		}
	}
	void multiplication(int n,int a[][],int b[][])
	{
		int MULTI[][]=new int[n][n];
		System.out.println("Multiplication is ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
					MULTI[i][j]=MULTI[i][j]+a[i][k]*b[k][j];
				}
				System.out.print(MULTI[i][j]+" ");
			}
			System.out.println();
		}
	}
	void acceptElements(int n,int a[][],int b[][])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements of 1st Matrix : ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter elements of 2nd Matrix : ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		int A[][]=new int[n][n];
		int B[][]=new int[n][n];
		
		Unit2_9_Matrix p=new Unit2_9_Matrix();
		p.acceptElements(n,A,B);
		p.addition(n, A, B);
		p.multiplication(n, A, B);
	}

}
