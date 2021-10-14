package lab;

import java.util.Scanner;

public class Unit2_3_Arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1 : Find the length of array");
		System.out.println("2 : Demonstrate a one-dimensional array");
		System.out.println("3 : Demonstrate a two-dimensional array");
		System.out.println("4 : Demonstrate a multi-dimensional array");
		System.out.println("Enter your choice : ");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1: System.out.println("Length of arrays");
				int a1[ ] = new int [10];
				int a2 [ ] = { 2,4,6, 0, 7, 98 , 34, -20 }; 
				int a3 [ ] = { 5, 4, 8, 2 };  
				System.out.println ("Length of a1 is "  + a1.length);
				System.out.println ("Length of a2 is " + a2.length);     
				System.out.println ("Length of a3 is "  + a3. length); 
				break;
		case 2: System.out.println("Demonstrate a one-dimensional array");
				int num[];
				int size =5;
				num = new int [size]; 
				num [0] = 10;
				num [1] = 20;
				num[2]  = 30;   
				num [3] = 40;  
				num [4] = 50;    
				for  (int  i =0; i<size; i++)
					System.out.println ("num [" + i  +" ] ="  + num [ i ]);
				break;
		case 3: case 4: System.out.println("Demonstrate a two-dimensional and multi dimensional array");
				int twoD[][] = new int[3][3];
				int i, j , k = 10;
				for (i=0; i<3; i++)
				for (j=0; j<3; j++)
				{ 
					twoD[i][j] = k;
					k++;
				}
				for (i=0; i< 3; i++)
				{            
					for ( j= 0;  j < 3; j++)
						System.out.print (twoD[i][j] + " ");
					System.out.println();  
				} 	
		}
	}
}