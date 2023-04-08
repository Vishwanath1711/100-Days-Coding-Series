package codingseries;
/*
Day 36 coding Statement : Write a Program to Capitalize the first and last letter of each word of a string
Description
Get a string from the user and then change the first and last letter to uppercase.
Input
programming
Output
ProgramminG
*/
import java.util.Scanner;
public class Day36 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = S.next();
        String up = "";
        for(int i=0;i<str.length();i++){
            if(i==0 || i==str.length()-1){
                up+=Character.toUpperCase(str.charAt(i));
            }else{
                up+=str.charAt(i);
            }
        }
        System.out.println(up);
    }
}
