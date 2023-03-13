package codingseries;
/*
Day 10 coding Statement:  Write a program to find Factorial of a number
Description
Get a number from user for which you need to fin the factorial, 
then calculate the factorial and give it as the output.
Input
4
Output
24
*/
import java.util.Scanner;
public class Day10 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n, fact=1;
		System.out.println("Enter the number:");
		n = S.nextInt();
		if(n==0 || n==1) {
			fact = 1;
		} else {
			for(int i=2;i<=n;i++) {
				fact = fact*i;
			}
		}
		System.out.println(fact);
	}

}
