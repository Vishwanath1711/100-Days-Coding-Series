package codingseries;
/*
Day 39 coding Statement : Write a Program to check if two strings are Anagram or not
Description
Get two strings as input from the user and check whether it is Anagram or not.
Input
sunlight thgiluns
Output
Anagram
*/
import java.util.*;
public class Day39 {
        static boolean isAnagram(String str1 , String str2) {
            String s1 = str1;
            String s2 = str2;
            boolean res=true;
            if(s1.length()!=s2.length())
                res = false;

            else {
                char[] arr1 = s1.toLowerCase().toCharArray();
                char[] arr2 = s2.toLowerCase().toCharArray();
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                res = Arrays.equals(arr1, arr2);
            }
            return res;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter two string: ");
            String str1 = sc.next();
            String str2 = sc.next();
            boolean status = isAnagram(str1,str2);
            if(status)
                System.out.println("Anagram");
            else
                System.out.println("Not Anagram");

        }
    }