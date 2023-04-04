package codingseries;
/*
Day 31 coding Statement : Write a Program to Toggle each character in a string
Description
Get an input string from user and then convert the lower case of alphabets
 to upper case and all upper-case alphabets into lower case.
Input
Hello
Output
hELLO
*/
import java.util.Scanner;
public class Day31 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = S.next();
        String str1="";
        for (int i = 0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))) {
                str1 += Character.toLowerCase(str.charAt(i));
            }else{
                    str1 += Character.toUpperCase(str.charAt(i));
                }
            }
        System.out.println(str1);
        }

    }
