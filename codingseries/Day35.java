package codingseries;
/*
Day 35 coding Statement : Write a Program to Count the sum of numbers in a string
Description
Get a string from the user and find the sum of numbers in the string.
Input
Hello56
Output
11
*/
import java.util.Scanner;
public class Day35 {
    public static void main(String[] args) {
        Scanner S =new Scanner(System.in);
        System.out.println("Enter the String");
        String str = S.next();
        int sum = 0;
        /*for (int i=0; i<str.length();i++){
            if(Character.isDigit(str.charAt(i)))
                sum+=Character.getNumericValue(str.charAt(i));
        }*/

        for (int i= 0; i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                sum+=(str.charAt(i)-'0');
            }
        }
        System.out.println(sum);
    }
}
