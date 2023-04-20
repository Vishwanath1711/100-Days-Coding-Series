package codingseries;
/*
Day 45 coding Statement : Write Program to find smallest and largest element in an array
Description
Get an array as input from the user and then find the smallest and largest element in the array.
Input
Enter the size of array :
5
Enter the elements :
10 20 5 40 30
Output
Smallest Number :
5
Largest Number :
40
 */
import java.util.Scanner;
public class Day45 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = S.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for (int i=0;i<n;i++){
            arr[i] = S.nextInt();
        }
        int max=arr[0], min = arr[0];
        for(int i=1;i<n;i++){
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        for(int i=1;i<n;i++){
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("Largest element: "+max);
        System.out.println("Lowest element: "+min);
    }
}
