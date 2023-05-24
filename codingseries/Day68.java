package codingseries;
/*
Day 68 coding Statement : you will be given queries. Each query is of one of the following three types: :
Add an element to the set. :
Delete an element from the set. (If the number is not present in the set, then do nothing). :
If the number is present in the set, then print "Yes"(without quotes) else print "No"(without quotes).
Input Format
The first line of the input contains where is the number of queries. The next lines contain query each.
Each query consists of two integers and where is the type of the query and is an integer.
Constraints

Output Format
For queries of type print "Yes"(without quotes)
if the number is present in the set and if the number is not present, then print "No"(without quotes).
Each query of type should be printed in a new line.
Sample Input
8
1 9
1 6
1 10
1 4
3 6
3 14
2 6
3 6
Sample Output
Yes
No
No
*/
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class Day68 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t = S.nextInt();
        Set<Integer> s = new LinkedHashSet<>();
        for (int i=0;i<t;i++){
            int query_type = S.nextInt();
            int integer = S.nextInt();
            if (query_type == 1){
                s.add(integer);
            }else if (query_type==2){
                    s.remove(integer);
            }else if (query_type==3){
                if (s.contains(integer))
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}
