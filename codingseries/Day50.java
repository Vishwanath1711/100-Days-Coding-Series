package codingseries;
/*
Day 50 coding Statement : Given an integer array of size N. Write Program to find sum of positive square elements in the array.
Sample input 1 :
4 1 2 3 4
Sample output 1 :
30
Explanation :
(1 + 4 + 9 + 16) = 30
Sample input 2 :
4 -1 -2 -3 -4
Sample output 2 :
30
Explanation :
(1 + 4 + 9 + 16) = 30
 */
import java.util.Scanner;
public class Day50 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = S.nextInt();
        int arr[]  = new int[n];
        int squaresum=0;
        System.out.println("Enter the elements: ");
        for (int i=0;i<n;i++){
            arr[i] = S.nextInt();
        }
        for (int i=0;i<n;i++){
            squaresum+=arr[i]*arr[i];
        }
        System.out.println(squaresum);
    }
}
