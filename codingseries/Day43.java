package codingseries;
/*
Day 43 coding Statement : Write Program to find the array type
Description
Get an array as input from the user and check the type of the array, whether it is odd, even or mixed type.
Input
Enter size of array :
3
Enter elements
1 3 5
Output
Odd
 */
import java.util.Scanner;
public class Day43 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n1 = S.nextInt();
        int arr[] = new int[n1];
        System.out.println("Enter the elements");
        for (int i=0;i<n1;i++){
            arr[i] = S.nextInt();
        }
        int evenCount=0,oddCount=0;
        for (int i=0;i<n1;i++){
            if(arr[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }

        if(evenCount==n1){
            System.out.println("Even type array");
        }else if(oddCount==n1){
            System.out.println("Odd type array");
        }else {
            System.out.println("Mixed type array");
        }
    }
}
