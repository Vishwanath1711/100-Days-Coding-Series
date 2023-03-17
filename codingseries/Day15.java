package codingseries;

import java.util.Scanner;

public class Day15 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = S.nextInt();
        int sum = 0;
        int copy = n;
        while(copy>0){
            int fact=1;
            int rem = copy%10;
            for(int i=1;i<=rem;i++){
                fact = fact*i;
            }
            sum+=fact;
            copy = copy/10;
        }
        if(sum == n){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a Strong Number");
        }
    }
}
