package codingseries;
/*
Day 69 coding Statement : Suppose, we have a class A which is the base class and
we have a class B which is derived from class A and we have a class C which is derived from class B,
we can access the functions of both class A and class B by creating an object for class C.
Hence, this mechanism is called multi-level inheritance. (B inherits A and C inherits B.)
Create a class called Equilateral which inherits from Isosceles and should have a function such that the output is as given below.
Sample Output
I am an equilateral triangle
I am an isosceles triangle I am a triangle
*/
class Triangle{
    public void display1() {
        System.out.println("I am triangle");
    }
}
class Isosceles extends Triangle{
    public void display2(){
        System.out.println("I am Isosceles triangle");
    }
}
class Equilateral extends Isosceles{
    public void display3(){
        System.out.println("I am Equilateral triangle");
    }
}
public class Day69 {
    public static void main(String[] args) {
        Equilateral e = new Equilateral();
        e.display3();
        e.display2();
        e.display1();
    }
}
