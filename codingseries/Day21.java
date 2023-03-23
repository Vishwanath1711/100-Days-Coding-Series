package codingseries;
/*
Day 21 coding Statement : Write a program to identify if the number is Palindrome or not
Description
Get a number as input from the user and check whether that number is a Palindrome or not.
Input
121
Output
Palindrome
Input
34
Output
Not a Palindrome
*/
import java.util.Scanner;
public class Day21 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = S.nextInt();
        int rem, rev=0;
        int copy=n;
        while(copy!=0){
            rem = copy%10;
            rev = rev*10+rem;
            copy/=10;
        }
        if(rev == n){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not a palindrome");
        }
    }
}
