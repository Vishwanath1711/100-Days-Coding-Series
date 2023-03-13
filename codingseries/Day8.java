package codingseries;
/*
Day 8 coding Statement:  Write a program to find roots of a quadratic equation
Description
Get the values of a, b and c (coefficients of quadratic equation) 
as input from the user and calculate the roots and print as the output.
Input
Enter the value of a, b and c : 1 -6 9
Output
Roots are equal
Root 1= root 2 = 3.00
*/
import java.util.Scanner;
public class Day8 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the value of a, b and c");
		double a = S.nextDouble();
		double b = S.nextDouble();
		double c = S.nextDouble();
		double root1,root2;
		double d = (b*b)-4*a*c;
		if(d==0) {
			System.out.println("Roots are equal");
			System.out.println("Root1 = Root2="+(-b)/2*a);
		}else if(d>0) {
			root1 = (-b+Math.sqrt(b*b-4*a*c)/2*a);
			root2 = (-b-Math.sqrt(b*b-4*a*c)/2*a);
			System.out.println("Root1="+root1+"Root2="+root2);
		}else {
			System.out.println("Roots are " + -b/(2*a) + "+i" +  Math.sqrt(-d)/(2*a) + " and "
		+ -b/(2*a) + "-i" + Math.sqrt(-d)/(2*a));
		}
		
	}

}
