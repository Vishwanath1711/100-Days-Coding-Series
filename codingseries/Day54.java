package codingseries;
/*
Day 54 coding Statement : Given an integer array of size N.
Write Program to find whether Arrays are disjoint or not.
Two arrays are said to be disjoint if they have no elements in common.
Sample input 1:
4
2 -4 -1 -3
3
1 3 5
Sample output 1:
Disjoint
Sample input 2:
5
1 5 -7 6 3
4
2 4 6 8
Sample output 2:
Not disjoint. ( 6 is common)
 */
import java.util.Scanner;
public class Day54 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("enter the first array size");
        int n1 = S.nextInt();
        int arr1[]  = new int[n1];
        System.out.println("Enter the elements: ");
        for (int i=0;i<n1;i++){
            arr1[i] = S.nextInt();
        }
        System.out.println("enter the first array size");
        int n2 = S.nextInt();
        int arr2[]  = new int[n2];
        System.out.println("Enter the elements: ");
        for (int i=0;i<n2;i++){
            arr2[i] = S.nextInt();
        }
        boolean isDisjoint=true;
            for (int i=0;i<n1;i++) {
                for (int j = 0; j < n2; j++) {
                    if (arr1[i] == arr2[j]) {
                        isDisjoint = false;
                    }
                }
                if (isDisjoint==false){
                    break;
                }
            }
            if (isDisjoint==true)
                System.out.println("Disjoint");
            else
                System.out.println("not disjoint");
    }
}
