package codingseries;
/*
Day 27 coding Statement : Write a program to find the double of
the given number without using arithmetic operator
Description
For the given input number calculate the double of
it without using arithmetic operator.
Input
4
Output
8
*/
import java.util.Scanner;
public class Day27 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = S.nextInt();
        int res = n<<1;

        System.out.println(res);
    }
}
