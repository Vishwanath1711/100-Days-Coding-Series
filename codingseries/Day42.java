package codingseries;
/*
Day 42 coding Statement : Write Program to check if two arrays are the same or not
Description
Get two arrays as the input from the user and check whether it is the same or not.
Input
Enter the size of first array :
3
Enter the size of second array :
3
Enter elements of first array :
1 2 3
Enter elements of second array :
1 2 3
Output
Same
 */
import java.util.Scanner;
public class Day42
{
    static void sortArray(int arr[], int n1)
    {
        int i,j;
        //bubble sort
        for (i = 0; i < n1-1; i++)
        {
            for (j = 0; j < n1-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static int isArraysSame(int arr1[], int arr2[], int n1, int n2)
    {
        sortArray(arr1,n1);
        sortArray(arr2,n2);
        int i, count = 0;
        for(i = 0; i < n1; i++)
        {
            if(arr1[i] == arr2[i])

            {
                count++;//to track the elements matching
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int n1,n2, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array: ");
        n1 = sc.nextInt();
        System.out.println("Enter the size of second array: ");
        n2 = sc.nextInt();
        int[] array1 = new int[n1];
        int[] array2 = new int[n1];
        System.out.println("Enter the elements of first array: ");
        for(int i = 0; i < n1; i++)
        {
            array1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of second array: ");
        for(int i = 0; i < n2; i++)
        {
            array2[i] = sc.nextInt();
        }

        if(isArraysSame(array1, array2, n1, n2) != n1)
        {
            System.out.print("Arrays are not same");
        }
       else
        System.out.print("Arrays are Same");
    }
}