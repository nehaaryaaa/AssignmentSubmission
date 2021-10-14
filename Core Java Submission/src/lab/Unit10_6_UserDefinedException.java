package lab;

import java.util.Scanner;

class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}
public class Unit10_6_UserDefinedException {
	
	public static void main(String[] args) {
		Unit10_6_UserDefinedException a=new Unit10_6_UserDefinedException();
		try 
		{
			a.myMethod();
		}
		catch (MyException e) 
		{
			e.printStackTrace();
		}
}
	void myMethod() throws MyException
	{
		String username,password;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Name : ");
		username=sc.next();
		System.out.println("Enter Password : ");
		password=sc.next();
		if(username.equals(password))
		{
			System.out.println("Successful Login");
		}
		else
		{
			throw new MyException("Invalid Login");
		}
	}
}
