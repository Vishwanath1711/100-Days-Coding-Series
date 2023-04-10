package codingseries;
/*
Day 38 coding Statement : Write a Program to print Non-repeating characters in a string
Description
Get a string as the input from the user and print the non-repeating characters in a string.
Input
Hello
Output
H e o
*/
import java.util.Scanner;
public class Day38 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int[] frequency = new int[str.length()];
        int i, j;
        char[] strnew = str.toCharArray();
        for(i = 0; i <str.length(); i++) {
            frequency[i] = 1;
            for(j = i+1; j <str.length(); j++) {
                if(strnew[i] == strnew[j]) {
                    frequency[i]++;
                    strnew[j] = '0';
                }
            }
        }
        for(i = 0; i <frequency.length; i++) {
           if(frequency[i]==1 && strnew[i]!='0')
               System.out.print(strnew[i]+" ");
        }
    }
}
