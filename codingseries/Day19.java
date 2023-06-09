package codingseries;
/*
Day 19 coding Statement : Write a program to identify if the number is Armstrong number or not
Description
Get an input number from user and check whether the given number is an Armstrong number or not.
E.g. Let the number be 1634,
Here 1^4 + 6^4 + 3 ^4 + 4^4 = 1634
Therefore, this is an Armstrong number
Input
153
Output
Armstrong number
Input
121
Output
Not an Armstrong number
*/
import java.util.Scanner;
public class Day19 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = S.nextInt();
        int m = n;
        int p = n;
        int count=0,sum=0;
        while(m!=0){
            m/=10;
            count++;
        }

        while(p!=0){
            int rem = p%10;
            sum+=Math.pow(rem,count);
            p/=10;
        }
        if(sum == n)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}
