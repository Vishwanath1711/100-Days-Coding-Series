package codingseries;
/*
Day 53 coding Statement : Given an integer array of size N.
Write Program to find maximum product subarray in a given array.
Sample input 1:
4
2 -4 -1 -3
Sample output 1:
8 = {2, -4, -1}
Sample input 2:
5
1 5 -7 5 3
Sample output 2:
15 = {5, 3}
 */
import java.util.Scanner;
public class Day53 {
    static int MaxSubArrProd(int arr[], int n)
    {
        int ans = arr[0];
        for (int i = 0; i < n; i++)
        {
            int prod = arr[i];
            for (int j = i + 1; j < n; j++)
            {
                ans = Math.max(ans,prod);
                prod =prod * arr[j];
            }
            ans = Math.max(ans,prod);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = S.nextInt();
        int arr[]  = new int[n];
        System.out.println("Enter the elements: ");
        for (int i=0;i<n;i++){
            arr[i] = S.nextInt();
        }
        System.out.println(MaxSubArrProd(arr,n));
    }
}
