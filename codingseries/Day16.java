package codingseries;
/*
Day 16 coding Statement : Write a program to identify if the number is Perfect number or not
Description
Get the input from the user and check whether that number is a perfect number or not.
E.g. Let number is 28, factors of 28 are 1,2,4,7,14. Now the sum of all these factors are 28 itself.
Input
28
Output
Perfect Number
Input
4
Output
Not a perfect number
*/
import java.util.Scanner;
public class Day16 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("enter the number");
        int n = S.nextInt();
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i == 0){
                sum+=i;
            }
        }
        if(sum == n) {
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a Perfect number");
        }
    }
}
