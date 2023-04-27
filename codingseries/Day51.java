package codingseries;
/*
Day 51 coding Statement : Given an integer array of size N, write a program to sort the array;
Sample input 1:
4
2 4 1 3
Sample output 1:
1 2 3 4
Sample input 2:
5
1 5 7 5 3
Sample output 2:
1 3 5 5 7
 */
import java.util.Scanner;
public class Day51 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = S.nextInt();
        int arr[]  = new int[n];
        System.out.println("Enter the elements: ");
        for (int i=0;i<n;i++){
            arr[i] = S.nextInt();
        }

        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
