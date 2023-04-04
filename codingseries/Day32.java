package codingseries;
/*
Day 32 coding Statement : Write a Program to Remove vowels from a string
Description
Get a string as the input from the user and then remove all the vowel
letters from the string and give the output.
Input
remove
Output
rmv
*/
import java.util.Scanner;
public class Day32 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = S.next();
        String res="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='A'&&str.charAt(i)!='a'&&str.charAt(i)!='E'&&str.charAt(i)!='e'
                    &&str.charAt(i)!='I'&&str.charAt(i)!='i'&&str.charAt(i)!='O'&&str.charAt(i)!='o'&&str.charAt(i)!='U'
            && str.charAt(i)!='u'){
                res+=str.charAt(i);
            }
        }
        System.out.println(res);
    }
}
