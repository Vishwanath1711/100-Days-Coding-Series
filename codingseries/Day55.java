package codingseries;
/*
Day 55 coding Statement : Given 2 integer arrays X and Y of same size.
Consider both arrays as vectors and print the sum of maximum scalar product (Dot product) of 2 vectors.
Sample input 1:
4
1 2 3 4
5 6 7 8
Sample output 1:
70
Explanation :
(8*4 + 7*3 + 6*2 + 1*5) = 70
Sample input 2:
4
-1 -2 -3 -4
5 6 -7 -8
Sample output 2:
37
Explanation :
(-4*-8 + -3*-7 + -2*5 + -1*6) = 37
 */
import java.util.Arrays;
import java.util.Scanner;
public class Day55 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = S.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.println("enter first array elements");
        for (int i=0;i<n;i++){
            arr1[i] = S.nextInt();
        }
        System.out.println("Enter second array elements");
        for (int i=0;i<n;i++){
            arr2[i] = S.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int sumOfProducts = 0;
        for (int i=0;i<n;i++){
            sumOfProducts+=arr1[i]*arr2[i];
        }
        System.out.println(sumOfProducts);
    }
}
