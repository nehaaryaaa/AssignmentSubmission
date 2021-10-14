package lab;

public class Unit10_5_ThrowsClause {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		System.out.println("Inside main");
		int arr[]= {1,2};
		System.out.println("arr[0] = "+arr[0]+"\narr[1] = "+arr[1]+"\narr[2] = "+arr[2]);
		System.out.println("This statement will not be printed");   
	}
}

