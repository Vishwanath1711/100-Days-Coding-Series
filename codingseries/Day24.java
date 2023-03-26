package codingseries;
/*
Day 24 coding Statement : Write a program to print Pyramid pattern using stars
Description
Get the number of lines as the input and print stars in that many lines or rows in a pyramid shape.
Input
4
Output
  *
 ***
*****
*******
 */
import java.util.Scanner;
public class Day24 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int rows;
        System.out.println("Enter the number of lines");
        rows = S.nextInt();
        for(int i=1; i<=rows; i++){
            for(int j=i; j<rows; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
