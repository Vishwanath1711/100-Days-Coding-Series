package codingseries;
/*
Day 49 coding Statement : Given 2 integer arrays X and Y of same size.
Consider both arrays as vectors and print the minimum scalar product (Dot product) of 2 vectors.
Sample input 1 :
4
1 2 3 4
5 6 7 8
Sample output 1 :
60
Explanation :
(4*5 + 3*6 + 2*7 + 1*8) = 60
Sample input 2 :
4
-1 -2 -3 -4
5 6 -7 -8
Sample output 2 :
-17
Explanation :
(-1*-8 + -2*-7 + -3*6 + -4*5) = -17
 */
import java.util.Scanner;
public class Day49 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n =S.nextInt();
        int vector1[] = new int[n];
        int vector2[] = new int[n];
        int sum=0;
        System.out.println("Enter the vector 1");
        for (int i=0;i<n;i++){
            vector1[i] = S.nextInt();
        }
        System.out.println("Enter the vector 2");
        for (int i=0;i<n;i++){
            vector2[i] = S.nextInt();
        }
        int j=n-1;
        for (int i=0;i<n;i++){
            sum = sum+vector1[i]*vector2[j];
            j--;
        }
        System.out.println("dot product: "+sum);
    }
}
