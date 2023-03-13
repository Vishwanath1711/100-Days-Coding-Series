package codingseries;
/*
Day 9 coding Statement : Write a program to find Number of digits in an integer
Description
Take an integer as the input from the user and then calculate 
the number of digits in the given input and print it as the output.
Input
3241
Output
4
Input
6
Output
1
*/
import java.util.Scanner;
public class Day9 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Number:");
		long n = S.nextLong();
		int count=0;
		if(n==0) {
			count=1;
		}else {
			while(n>0) {
				n=n/10;
				count++;
			}
		}
		System.out.println(count);

	}

}
