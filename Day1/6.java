// 06.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class.
//  Then calculate and print the area and circumference of the circle.
import java.util.Scanner;
class circle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the circle dimentions");
        int r = sc.nextInt();
        double C = 2*(3.14*r);
        double A = 3.14*(r*r);
        System.out.println("circumference of the circle : "+C);
        System.out.println("Area of the circle : "+A);
    }
}