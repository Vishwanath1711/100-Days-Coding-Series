package codingseries;
/*
Day 48 coding Statement : Write Program to remove duplicate elements in an array
Description
Get an array as input from the user and then remove all the duplicate elements in that array.
Input
Enter the size of array
5
Enter the elements of array
35 35 45 60 60
Output
35 45 60
 */
import java.util.Scanner;
public class Day48 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n =S.nextInt();
        int arr[] =  new int[n];
        int distinct[] = new int[n];
        System.out.println("Enter the array elements");
        for (int i=0;i<n;i++){
            arr[i] = S.nextInt();
        }
        for (int i=0;i<n;i++){
            distinct[i] = arr[i];
        }
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j])
                    distinct[j]=0;
            }
        }
        System.out.println("Array with the distinct elements");
        for (int i=0;i<n;i++){
            if (distinct[i]!=0)
                System.out.print(distinct[i]+" ");
        }
    }
}
