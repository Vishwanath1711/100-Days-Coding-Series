package codingseries;
/*
Day 15 coding Statement : Write a program to identify if the number is Strong number or not
Description
Get a number as input from user and then check whether
that number is a strong number or not. A number is said to be strong number
if the sum of the factorial of each digit in the number is same as that of the number.
E.g. let the number be 145
Here 1! + 4! + 5! is 1 + 24 + 120 which is equal to 145 itself.
Input
121
Output
Not a strong number
Input
2
Output
Strong number
*/
import java.util.Scanner;
public class Day15 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = S.nextInt();
        int sum = 0;
        int copy = n;
        while(copy>0){
            int fact=1;
            int rem = copy%10;
            for(int i=1;i<=rem;i++){
                fact = fact*i;
            }
            sum+=fact;
            copy = copy/10;
        }
        if(sum == n){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a Strong Number");
        }
    }
}
