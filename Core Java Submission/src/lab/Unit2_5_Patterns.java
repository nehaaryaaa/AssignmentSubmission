package lab;

import java.util.Scanner;

public class Unit2_5_Patterns {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1 : Pattern 1");
		System.out.println("2 : Pattern 2");
		System.out.println("3 : Pattern 3");
		System.out.println("Enter your choice : ");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1: String  k = "1", l = " ", s = "1";
				int m =  0;
				int  n =  5;
				for (int  i  =  0; i  < n; i++)
				{
					for (int j = 1; j < m; j++) 
					{ 
						l+= "0";
					}
					if(i<=0)
						System.out.println (k + l +"\n");
					if(i>0)
						System.out.println(k+l+s+"\n");
					l = "";
					m += 2;
				} 
				break;
		case 2: String str= "" ;
				int num = 5;
				for (int i = 5; i  >= 0; i--)
				{
					str = i +" "  + str;
					System.out.println (str + "\n");
				}
				break;
		case 3: String sstr =" ";
				int no = 6;
				for ( int i = 1; i <= no; i++)  
				{ 
					sstr += i + " ";
					System.out.println (sstr +"\n");
				}
		}
	}

}
