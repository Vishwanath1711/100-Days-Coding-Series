package codingseries;
/*
Day 40 coding Statement : Write a Program to Replace substring in a string
Description
Get a string as input from the user and then
get another string which has to be removed from the string.
Get the third input, the new substring which is placed in that substring position.
Finally print the output by replacing the substring with new string.
*/
import java.util.Scanner;
public class Day40 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = S.nextLine();
        System.out.println("Enter the substring to be removed");
        String substring = S.nextLine();
        System.out.println("Enter the new string to be added");
        String newstring = S.nextLine();

        String result = str.replace(substring,newstring);
        System.out.println("Updated string:"+result);
    }
}
