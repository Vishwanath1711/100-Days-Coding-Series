package codingseries;
/*
Day 30 coding Statement : Write a Program to print Length of the string without using strlen() function
Description
Get a string as input from user and print the length of the string without using strlen() function.
Input
Hello
Output
5
*/
import java.util.Scanner;
public class Day30 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = S.next();
        char[] str1 = str.toCharArray();
        //System.out.println(str1.length);
        int i;
        for(i=0;i<str1.length;i++){

        }
        System.out.println(i);

    }

}
