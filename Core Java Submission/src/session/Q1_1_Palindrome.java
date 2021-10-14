package session;

import java.util.Scanner;

public class Q1_1_Palindrome {

	public static void main(String[] args) {
		int n,temp,sum=0,palin;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		
		temp=n;    
        while(n>0)
        {    
            palin=n%10;
            sum=(sum*10)+palin;    
            n=n/10;    
        }    
        if(temp==sum)    
            System.out.println(temp+" is a Palindrome");    
        else    
            System.out.println(temp+" is Not a Palindrome"); 
        
        sc.close();

	}

}
