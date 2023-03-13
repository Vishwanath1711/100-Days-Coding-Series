package codingseries;
/*
Day 4 coding Statement:  
Write a program to identify of the a number is positive or negative
Description
Get an input number from the user and check whether it is a positive or negative number.
Input :
-10
Output : 
Negative number
Input :
0
Output :
Neither positive nor negative
Input :
15
Output : 
Positive number
*/
import java.util.Scanner;

public class Day4 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int num = S.nextInt();
		if(num>0) {
			System.out.println("Positive number");
		}else if(num<0) {
			System.out.println("Negative number");
		}else {
			System.out.println("Neither positive nor Negative");
		}
		
	}

}
