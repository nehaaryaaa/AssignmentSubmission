package lab;

public class Unit4_2_Home {
	Unit3_1Room r;
	void createHome()
	{
		r = new Unit3_1Room();
		r.setData(101, "Delux", 500, "Yes");
	}
	
	void displayHome()
	{
		r.displayData();
	}
	public static void main (String args[]) 
	{
		Unit4_2_Home h  = new Unit4_2_Home();
		h.createHome(); 
		h.displayHome();    
	} 
}
