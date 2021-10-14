package lab;

import java.util.Scanner;

public class Unit2_4_CommandLineArgs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1 : To find the sum of command line arguments and count the invalid integers entered.");
		System.out.println("2 : To get the name using command line.");
		System.out.println("Enter your choice : ");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1: System.out.println("To find the sum of command line arguments and count the invalid integers entered.");
				int sum = 0;
				int invalid = 0;
				for(int i=0; i<args.length;i++)
				{ 
					try
					{ 
						sum += Integer.parseInt(args[i]);
					}
					catch(NumberFormatException e)
					{     
						invalid++;
					}
				}
				System.out.println("Total no. of arguments :"+ args.length);
				System.out.println("Invalid Integers:" + invalid);
				System.out.println("Sum : "+sum);
				break;
		case 2: System.out.println("To get the name using command line");
				for( int i=0 ;  i < args.length ; i++)
					System.out.println (args [ i ]); 
		}
	}
}
