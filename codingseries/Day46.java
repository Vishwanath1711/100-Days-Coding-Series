package codingseries;
/*
Day 46 coding Statement : Write Program to find sum of elements in an array
Description
Get an array as the input from the user and find the sum of the elements.
Input
Enter the size of array
3
Enter the elements of array
5 10 15
Output
30
 */
import java.util.Scanner;
public class Day46 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements");
        for (int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of the array elements "+sum);
    }
}
