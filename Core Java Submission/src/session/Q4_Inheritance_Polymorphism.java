package session;

import java.util.Scanner;

public class Q4_Inheritance_Polymorphism {

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
				 s.area();
				 s.draw();
				 break;
		case 2 : System.out.println("Enter the base and height of Triangle : ");
		 		 base=sc.nextDouble();
		 		 height=sc.nextDouble();
		 		 s=new Triangle(base,height);
		 		 s.area();
		 		 s.draw();
		 		 break;
		case 3 : System.out.println("Enter the side of a Square : ");
		 		 side=sc.nextDouble();
		 		 s=new Square(side);
		 		 s.area();
		 		 s.draw();
		 		 break;
		}
	}

}
abstract class Shape {
	double d1,d2;
	Shape(double d1,double d2)
	{
		this.d1=d1;
		this.d2=d2;
	}
	abstract void area();
	abstract void draw();
}
class Circle extends Shape {
	Circle(double r)
	{
		super(r,0);
	}
	void area()
	{
		System.out.println("Area of Circle is "+(3.14*d1*d1));
	}
	void draw() {
		System.out.println("Circle");
	}
}
class Triangle extends Shape {
	Triangle(double b,double h)
	{
		super(b,h);
	}
	void area()
	{
		System.out.println("Area of Triangle is "+(0.5*d1*d2));
	}
	void draw() {
		System.out.println("Triangle");
	}
}
class Square extends Shape {
	Square(double side)
	{
		super(side,0);
	}
	void area()
	{
		System.out.println("Area of Circle is "+(d1*d1));
	}
	void draw() {
		System.out.println("Square");
	}
}