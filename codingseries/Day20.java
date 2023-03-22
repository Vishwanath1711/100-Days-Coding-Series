package codingseries;
/*
Day 20 coding Statement : Write a program to identify if the number is Prime number or not
Description
Get a number as input from the user and check whether that number is prime or not.
A prime number is a number with factors as 1 and that number itself.
Input
1
Output
1 is not a prime number
Input
5
Output
5 is a prime number
 */
import java.util.Scanner;
public class Day20 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = S.nextInt();
        int flag = 0;
        if(n==0 || n==1)
            flag = 1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) {
                flag = 1;
                break;
            }
        }
        if(flag ==0)
            System.out.println(n+" is a prime number");
        else
            System.out.println(n+" is not a prime number");
    }
}
