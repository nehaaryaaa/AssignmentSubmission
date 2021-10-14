package session;

public class Q3_Has_A_Relationship {

	public static void main(String[] args) {
		Project p1=new Project(101,"Mobile App For Project Management","Pune");
		Employee e1=new Employee(1,"Neha",26000,p1);
		Employee e2=new Employee(2,"Pawan",20000,p1);

		Project p2=new Project(102,"E-Commerce Wep App","Mumbai");
		Employee e3=new Employee(3,"Pooja",10000,p2);
		Employee e4=new Employee(4,"Divya",30000,p2);
		for(Employee e : new Employee[]  {e1,e2,e3,e4}) {
			if(e.esal>25000 && e.proj.pname=="E-Commerce Wep App")
			{
				System.out.println("Employee Id : "+e.eid+"\nName : "+e.ename+"\nSalary : "+e.esal+"\nProject Id : "+e.proj.pid+"\nProject Name : "+e.proj.pname+"\nLocation : "+e.proj.plocation+"\n");
			}
		}
	}

}
class Employee {
	int eid;
	String ename;
	double esal;
	Project proj;
	Employee(int id,String name,double sal,Project p)
	{
		this.eid=id;
		this.ename=name;
		this.esal=sal;
		this.proj=p;
	}
}
class Project {
	int pid;
	String pname;
	String plocation;
	Project(int id,String name,String loc)
	{
		this.pid=id;
		this.pname=name;
		this.plocation=loc;
	}
}
