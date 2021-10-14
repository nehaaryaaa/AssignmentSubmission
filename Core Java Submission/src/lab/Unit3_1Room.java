package lab;

import java.util.Scanner;

public class Unit3_1Room {
	int roomNo;
	String roomType;
	double roomArea;
	String acMachine;
	
	void setData(int rno, String rt, double area, String ac)
	{  
		roomNo = rno; 
		roomType = rt;
		roomArea = area;
		acMachine = ac;
	}   
	void displayData()
	{
		System.out.println("The room #. Is "   + roomNo);
		System.out.println ("The room Type is "  + roomType); 
		System.out.println ("The room area is "   + roomArea);    
		System.out.println ("The A/c Machine needed "  + acMachine); 
	} 
	public static void main(String[] args)
	{
		Unit3_1Room room1 = new Unit3_1Room();
		room1.setData(401,"Classis",450,"yes");
		room1.displayData ();
	}

}
