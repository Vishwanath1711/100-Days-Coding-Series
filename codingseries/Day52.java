package codingseries;
/*
Day 52 coding Statement : Given an integer array of size N, write a program to reverse the array;
Sample input 1:
4
2 4 1 3
Sample output 1:
3 1 4 2
Sample input 2:
5
1 5 7 5 3
Sample output 2:
3 5 7 5 1
 */
import java.util.Scanner;
public class Day52 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = S.nextInt();
        int arr[]  = new int[n];
        System.out.println("Enter the elements: ");
        for (int i=0;i<n;i++){
            arr[i] = S.nextInt();
        }
        System.out.println("Reverse array");
        for (int i = n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
