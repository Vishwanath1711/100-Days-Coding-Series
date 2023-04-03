package codingseries;
/*
Day 29 coding Statement : Write a Program to concatenate a string.
Description
Get two strings as input from the user and then concatenate it.
Input
Enter first string
Hello
Enter second string
Hi
Output
HelloHi
 */
import java.util.Scanner;
public class Day29 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = S.next();
        System.out.println("Enter second string");
        String str2 = S.next();

        System.out.println(str1+str2);
        //System.out.println(str1.concat(str2));
    }
}
