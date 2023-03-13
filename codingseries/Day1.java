package codingseries;
/*
Day 1 coding Statement: 
Write a program to identify if the character is a vowel or consonant.
Description of the program: 
Take an input character from the user and 
check whether the given input is a vowel or consonant.
Input
A
Output
Vowel
Input
m
Output
Consonant
Input
3
Output
Invalid Input
*/
import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		char ch = S.next().charAt(0);//taking character as a Input
		if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' ||
				ch=='O' || ch=='o' || ch=='U' || ch=='u')
			System.out.println("Vowel");
		else if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
			System.out.println("Consonant");
		else
			System.out.println("Invalid Input");
	}

}
