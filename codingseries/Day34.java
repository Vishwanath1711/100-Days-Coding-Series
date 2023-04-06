package codingseries;
/*
Day 34 coding Statement : Write a Program to Remove brackets from an algebraic expression
Description
Get an algebraic expression as input from the user and then remove all the brackets in that.
Input
7x+(2*y)
Output
7x+2*y
 */
import java.util.Scanner;
public class Day34 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = S.next();
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == ')') {
                continue;
            }
            newstr += str.charAt(i);
        }
        System.out.println(newstr);
    }
}
