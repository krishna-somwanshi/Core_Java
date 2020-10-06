// 35.	Create a class MathOperation that has four static methods.
// add() method that takes two integer numbers as parameter and returns the sum of the numbers.
// subtract() method that takes two integer numbers as parameter and returns the difference of the numbers.
// multiply() method that takes two integer numbers as parameter and returns the product. 
// power() method that takes two integer numbers as parameter and returns the power of 
// first number to second number. Create another class Demo (main class) that takes the two numbers
// from the user and calls all four methods of MathOperation class by providing entered numbers and 
// prints the return values of every method.

import java.util.*;
import java.lang.Math; 
class MathOperation{
    static void add(int i,int j){
        System.out.println(i+j);
    }
    static void subtract(int i, int j){
        System.out.println(i-j);
    }
    static void multiply(int i, int j){
        System.out.println(i*j);
    }
    static void power(int i,int j){
        System.out.println(Math.pow(i, j)); 
    }
}
class Demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        MathOperation m = new MathOperation();
        m.add(num1,num2);
        m.subtract(num1,num2);
        m.multiply(num1,num2);
        m.power(num1,num2);
    }
}