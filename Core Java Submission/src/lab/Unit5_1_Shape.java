package lab;

import java.util.Scanner;

public class Unit5_1_Shape {

	public static void main(String[] args) {
		double radius,base,height,side;
		Shape s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose any one : ");
		System.out.println("1 : Circle\n2 : Triangle\n3 : Square");
		int c=sc.nextInt();
		switch(c)
		{
		case 1 : System.out.println("Enter the radius of Circle : ");
				 radius=sc.nextDouble();
				 s=new Circle(radius);
				 s.draw();
				 s.erase();
				 break;
		case 2 : System.out.println("Enter the base and height of Triangle : ");
		 		 base=sc.nextDouble();
		 		 height=sc.nextDouble();
		 		 s=new Triangle(base,height);
		 		 s.draw();
		 		 s.erase();
		 		 break;
		case 3 : System.out.println("Enter the side of a Square : ");
		 		 side=sc.nextDouble();
		 		 s=new Square(side);
		 		 s.draw();
		 		 s.erase();
		 		 break;
		}
	}

}
class Shape {
	double d1,d2;
	Shape(double d1,double d2)
	{
		this.d1=d1;
		this.d2=d2;
	}
	void erase()
	{
		System.out.println("Erase Shape");
	}
	void draw()
	{
		System.out.println("Draw shape");
	}
}
class Circle extends Shape {
	Circle(double r)
	{
		super(r,0);
	}
	void erase()
	{
		System.out.println("Circle erase()");
	}
	void draw() {
		System.out.println("Circle draw()");
	}
}
class Triangle extends Shape {
	Triangle(double b,double h)
	{
		super(b,h);
	}
	void erase()
	{
		System.out.println("Triangle erase()");
	}
	void draw() {
		System.out.println("Triangle draw()");
	}
}
class Square extends Shape {
	Square(double side)
	{
		super(side,0);
	}
	void erase()
	{
		System.out.println("Square erase()");
	}
	void draw() {
		System.out.println("Square draw()");
	}
}