package lab;

import java.util.Scanner;

public class Unit2_7_Ascending {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many numbers ? ");
		int n=sc.nextInt();		
		int a[]=new int[n];
		
		System.out.println("Enter the numbers : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Ascending Order : ");
		for(int x:a)
		{
			System.out.print(x+" ");
		}

	}

}
