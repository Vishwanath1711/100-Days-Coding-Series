package codingseries;
/*
Day 78 coding Statement :
For a given array B1?,B2?,…,BM? of length at least 3,
let's define its weight as the largest value of (Bi?−Bj?)⋅(Bj?−Bk?) over all possible triples (i,j,k) with 1≤i,j,k≤M and i!=j, j!=k, k!=i.
You are given a sorted array A1?,A2?,…,AN? (that is, A1?≤A2?≤…≤AN?).
Calculate the sum of weights of all contiguous subarrays of A of length at least 3.
That is, count the sum of weights of arrays [Ai?,Ai+1?,…,Aj?] over all 1≤i<j≤N with j−i≥2.
Input Format
The first line of input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains an integer N.
The second line of each test case contains N space-separated integers A1?,A2?,…,AN?.
Output Format
For each test case, print a single line containing the sum of weights of all subarrays of A of length at least 33.
Sample Input
2
4
1 2 3 4
5
1 42 69 228 2021
Sample Output
4
1041808
*/
import java.util.Scanner;
public class Day78 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number of test cases ");
        int t = S.nextInt();
        for (int i=0;i<t;i++){
            int n = S.nextInt();
            int[] arr = new int[n];
            for (int j=0;j<n;j++){
                arr[i] = S.nextInt();
            }
        }
    }
}
