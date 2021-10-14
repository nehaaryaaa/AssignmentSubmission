package lab;

import java.util.Scanner;

public class Unit2_6_PrimeSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1 : Prime number checking");
		System.out.println("2 : Sum of digit");
		System.out.println("Enter your choice : ");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1: int i, j, n, lastn;
				System.out.println("Prime numbers between 0 to 100");
				double a;
				boolean flag;      
				for (i=0;i<100;i++)
				{   
					a = i;
					a = Math.sqrt (a);  
					lastn = (int)a;  
					flag =true;
					for (j=2;j<=lastn; j++)
					{
						if(i != j)
						{     
							if(i % j ==0)
							{
								flag = false;
								break;
							}
						}
					}
					if(flag)
						System.out.println ("\n" + i );     
				} 
				break;
		case 2: int num, s;
				num = 6110;
				s=0;
				System.out.println (num);
				while (num>10)  
				{
					s += num%10;
					num/=10;  
				}
				s += num;
				System.out.println("The sum of the digits of is : " + s);   
		}
	}
}