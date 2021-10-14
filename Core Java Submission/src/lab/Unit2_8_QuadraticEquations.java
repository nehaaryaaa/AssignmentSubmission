package lab;

import java.util.Scanner;

public class Unit2_8_QuadraticEquations {

	public static void main(String[] args) {
		double a,b,c,discriminant,root1,root2,relPart,imgPart;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the coefficients a, b and c : ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		discriminant=(b*b)-4*a*c;
		if(discriminant>0)
		{
			root1=(-b + Math.sqrt(discriminant)) / (2*a);
			root2=(-b - Math.sqrt(discriminant)) / (2*a);
			System.out.printf("Root 1 = %.4f \nRoot 2 = %.4f",root1,root2);
		}
		else if(discriminant==0)
		{
			root1=root2=-b/(2*a);
			System.out.println("Root 1 = Root 2 = "+root2);
		}
		else
		{
			relPart=-b/(2*a);
			imgPart=Math.sqrt(-discriminant);
			System.out.printf("Root 1 = %.4f + %.4fi \n",relPart,imgPart);
			System.out.printf("Root 1 = %.4f - %.4fi",relPart,imgPart);
		}

	}

}
