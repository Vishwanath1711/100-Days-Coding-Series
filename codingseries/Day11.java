package codingseries;
/*
Day 11 coding Statement:  Write a program to find Fibonacci series up to n
Description
Fibonacci series is a special series where nth term 
is the sum of previous two terms in the series. 
The series starts with 0 and 1 as the first and second term of the series respectively.
Here you need to get the value for nth term from user and 
then print Fibonacci series containing n terms.
Input
5
Output
0,1,1,2,3
Input
8
Output
0,1,1,2,3,5,8,13
*/
import java.util.Scanner;
public class Day11 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int n=S.nextInt();
		int first=-1, second=1;
		for(int i=0;i<n;i++) {
			int fib=first+second;
			first = second;
			second = fib;
			System.out.print(fib+",");
		}

	}

}
