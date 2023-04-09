package codingseries;
/*
Day 37 coding Statement : Write a Program to calculate the Frequency of characters in a string
Description
Get a string as the input from the user and find the frequency of characters in the string.
Input
program
Output
The frequency of a is 1
The frequency of g is 1
The frequency of m is 1
The frequency of o is 1
The frequency of p is 1
The frequency of r is 2
*/
import java.util.Scanner;

public class Day37
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int[] frequency = new int[str.length()];
        int i, j;
        char[] strnew = str.toCharArray();
        for(i = 0; i <str.length(); i++) {
            frequency[i] = 1;
            for(j = i+1; j <str.length(); j++) {
                if(strnew[i] == strnew[j]) {
                    frequency[i]++;
                    strnew[j] = '0';
                }
            }
        }
        System.out.println("Frequencies: ");
        for(i = 0; i <frequency.length; i++) {
            if(strnew[i] != ' ' && strnew[i] != '0')
                System.out.println(strnew[i] + " - " + frequency[i]);
        }
    }
}
