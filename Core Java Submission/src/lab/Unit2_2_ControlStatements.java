package lab;

import java.util.Scanner;

public class Unit2_2_ControlStatements 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice : ");
		System.out.println("1: If statements.\n2 : Do statements\n3 : For loop.\n4 : While Statements.\n5 : Switch Statements.\n");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1: int x = 20;          int y = 10;      
					System.out.println("Use of If statements");
					if (x > y )   
					{
						System.out.println ("x is greater than y" );               
					}          
					else  
					{             
						System.out.println ("X is lesser than y");               
					} 
					break;
			case 2: int  k= 0;
					do  
					{
						System.out.println ("I’m  stuck !" ) ; 
						k++;           
						if (k > 5)
							break; 
					} while (true);
					break;					
			case 3: int i= 0; 
					System.out.println("Use of for statements");
					int sum = 0;         
					for( i = 0; i <= 10; i++)         
						sum += i;   
					System.out.println ("The sum of first 10 Nos ="  + sum );  
					break;
			case 4: int j=1;  
					System.out.println("Use of while statements");
					while (j<=5)        
					{     
						System.out.println ("i ="  + j);            
						j++;             
					}
					break;
			case 5: char  ch = 'A'; 
					System.out.println("Use of switch statements");
					switch (ch)   
					{               
						case 'A': System.out.println  ("Value is A");                  
								  break;               
						case 'B': System.out.println ("Value is B");                  
								  break;          
						default:  System.out.println ("Unknown Value");                 
					} 
				
					break;
		}
	}
}