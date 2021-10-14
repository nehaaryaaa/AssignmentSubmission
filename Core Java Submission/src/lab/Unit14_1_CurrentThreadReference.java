package lab;

public class Unit14_1_CurrentThreadReference {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println ("Current Thread : " + t);
		System.out.println("Name Of The Current Thread : " + t.getName());
		System.out.println ("Priority : "  + t.getPriority()); 
		t.setName("currthread");              
		System.out.println ("Changed Name : " + t);
		t.setPriority (4);  
		System.out.println ("After Priority Change : " + t);
		System.out.println ("Number Of Active Threads : " + t.activeCount());
	}

}
