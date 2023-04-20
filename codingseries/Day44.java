package codingseries;
/*
Day 44 coding Statement : Write Program to find number of even and odd elements in an array
Description
Get an array as input from the user and then count the number of even and odd elements present in the array.
Input
Enter size of array
4
Enter the elements :
1 3 4 5
Output
Number of even elements :
1
Number of odd elements :
3
 */
import java.util.Scanner;
public class Day44 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n1 = S.nextInt();
        int arr[] = new int[n1];
        System.out.println("Enter the elements");
        for (int i = 0; i < n1; i++) {
            arr[i] = S.nextInt();
        }
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < n1; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of even elements: "+evenCount);
        System.out.println("Number of odd elements: "+oddCount);
    }
}
