package session;

import java.util.Scanner;

public class Q2_Students {
	int SId;
	String SName;
	int SMarks;
	String SCourse;
	Q2_Students(int i,String n,int m,String c)
	{
		this.SId=i;
		this.SName=n;
		this.SMarks=m;
		this.SCourse=c;
	}
	void showDetails()
	{
		System.out.println("Student Id = "+SId+" Name = "+SName+" Marks = "+SMarks+" Course = "+SCourse);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id,marks;
		String name,course;
		Q2_Students s[]=new Q2_Students[5];
		System.out.println("Enter the deatils - ");
		for(int i=0;i<5;i++)
		{
			System.out.println("For Student "+(i+1));
			System.out.println("Enter id : ");
			id=sc.nextInt();
			System.out.println("Enter Name : ");
			name=sc.next();
			System.out.println("Enter Course : ");
			course=sc.next();
			System.out.println("Enter Marks : ");
			marks=sc.nextInt();
			
			s[i]=new Q2_Students(id,name,marks,course);
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Student "+(i+1)+" Details : ");
			s[i].showDetails();
		}
		}
}
