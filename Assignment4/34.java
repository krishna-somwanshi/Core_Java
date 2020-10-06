// 34.	Create a class Circle that has two data members, one to store the radius 
// and another to store area and three methods first init() method to input radius
//  from user, second calculateArea() method to calculate area of circle and third
//   display() method to display values of radius and area. Create class CircleDemo
//    ( main class) that creates the Circle object and calls init(), calculateArea() and display() methods.
import java.util.Scanner;
class Circle{
    Scanner sc = new Scanner(System.in);
    int radius;
    float area;
    float pi = 3.14f;
    void init(){
        System.out.println("Enter the radious");
        radius = sc.nextInt();
    }
    void calculateArea(){
        area = pi*(radius*radius);
    }
    void display(){
        System.out.println("Area = "+area);
    }
}
class CircleDemo{
    public static void main(String args[]){
        Circle c = new Circle();
        c.init();
        c.calculateArea();
        c.display();
    }
}