package lab;

import java.util.Scanner;

public class Unit1_3_Equals {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter String 1 : ");
		s1=sc.next();
		System.out.println("Enter String 2 : ");
		s2=sc.next();
		if(s1.equals(s2))
			System.out.println("The two strings are EQUAL");
		else
			System.out.println("The two strings are NOT EQUAL");
	}

}
