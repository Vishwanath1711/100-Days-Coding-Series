package codingseries;
/*
Day 25 coding Statement : Write a program to find Area of a circle
Description
Get the value for radius from the user and calculate the area of the circle for the given radius.
Area of circle = 3.14*radius*radius
Input
3
Output
28.26
*/
import java.util.Scanner;
public class Day25 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the radius");
        float r = S.nextFloat();
        float area;

        area = (float)3.14*r*r;

        System.out.println("Area of the circle: "+area);

    }
}
