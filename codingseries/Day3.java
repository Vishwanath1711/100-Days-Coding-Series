package codingseries;
/*
Day 3 coding Statement: 
 Write a program to find ASCII values of a character
 Description:
Get an input character from the user and 
give the ASCII value of the given input as the output.
Input:
b
Output:
98
Input:
B
Output:
66
*/
import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		System.out.println("enter a character:");
		char ch = S.next().charAt(0);
		
		System.out.print((int)ch);//integer equivalent

	}

}
