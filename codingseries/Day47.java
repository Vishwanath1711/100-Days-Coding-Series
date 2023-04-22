package codingseries;
/*
Day 47 coding Statement : Write Program to find longest palindrome in an array
Description
Get an array as the input from the user and find the longest palindrome in that array.
Input
Enter the size of array
3
Enter the elements of array
121 10456 1000001
Output
1000001
 */
import java.util.*;
class Day47
{
    static boolean check(int n)
    {
        int div = 1;
        while (n / div >= 10)
            div *= 10;
        while (n != 0) {
            int x = n / div;
            int y = n % 10;
            if (x != y)
                return false;
            n = (n % div) / 10;
            div = div / 100;
        }
        return true;
    }
    static int largestPal(int []arr, int n)
    {
        int res = -1;
        for (int i = 0; i < n; i++)
        {

            if (arr[i] > res && check(arr[i]))
                res = arr[i];
        }
        return res;
    }
    public static void main(String []args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Longest Palindrome: "+largestPal(arr, n));
    }
}