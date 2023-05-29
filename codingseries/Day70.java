package codingseries;
/*
Day 70 coding Statement : Given an array, rotate the array by one position in clock-wise direction.
Example 1:
Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
Example 2:
Input:
N = 8
A[] = {9, 8, 7, 6, 4, 2, 1, 3}
Output:
3 9 8 7 6 4 2 1
*/
import java.util.Scanner;
public class Day70 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = S.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i=0;i<n;i++){
            arr[i] = S.nextInt();
        }
        for (int i=0;i<1;i++) {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
