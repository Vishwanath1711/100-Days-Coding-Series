package codingseries;
/*
Day 41 coding Statement : Check if two strings match where one string contains wildcard characters
Description
Get two strings as input from the user, first with wildcard characters (* and ?)
and second without wildcard characters.
Then check whether they match or not.
Input
Ta**nt
Talent
Output
Yes they match
 */
import java.util.Scanner;
public class Day41
{
    static boolean match(String first, String second)
    {
        if (first.length() == 0 && second.length() == 0)
            return true;
        if (first.length() > 1 &&first.charAt(0) == '*') {
            int i=0;
            while (i+1<first.length() && first.charAt(i+1) == '*')
                i++;
            first=first.substring(i);
        }
        if (first.length() > 1 && first.charAt(0) == '*' &&
                second.length() == 0)
            return false;
        if ((first.length() > 1 && first.charAt(0) == '?') ||
                (first.length() != 0 && second.length() != 0 &&
                        first.charAt(0) == second.charAt(0)))
            return match(first.substring(1),
                    second.substring(1));
        if (first.length() > 0 && first.charAt(0) == '*')
            return match(first.substring(1), second) ||
                    match(first, second.substring(1));
        return false;
    }
    static void test(String first, String second)
    {
        if (match(first, second))
            System.out.println("matching");
        else
            System.out.println("Not matching");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first = input.next();
        String second = input.next();
        test(first,second);
    }
}

