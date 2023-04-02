package codingseries;
/*
Day 28 coding Statement : Write a Program to reverse a string.
Description
Get an input string from user and print it in reverse order.
Input
Hello
Output
olleH
*/
import java.util.Scanner;
public class Day28 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = S.next();

        char[] str1 = str.toCharArray();

        for(int i = str1.length-1; i>=0;i--){
            System.out.print(str1[i]);
        }
    }
}
