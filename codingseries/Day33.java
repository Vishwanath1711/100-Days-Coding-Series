package codingseries;
/*
Day 33 coding Statement : Write a Program to check if String is a palindrome or not
Description
Get an input string from the user and then
check whether it is a palindrome string or not.
Input
noon
Output
Palindrome
Input
Talent
Output
Not a Palindrome
*/
import java.util.Scanner;
public class Day33 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = S.next();
        String rev = "";

        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }

        if(str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not an Palindrome");
    }
}
