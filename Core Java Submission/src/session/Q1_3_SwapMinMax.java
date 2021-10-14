package session;

import java.util.Scanner;

public class Q1_3_SwapMinMax {

	public static void main(String[] args) {
		int arr[]=new int[5],max=0,min=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 elements : ");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<5;i++)
		{
			if(arr[i]>max)
				max=i;
			if(arr[i]<min)
				min=i;
		}
		System.out.println("The modified array is : ");
		for(int i=0;i<5;i++)
		{
			int temp=arr[max];
			arr[max]=arr[min];
			arr[min]=temp;
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

}
