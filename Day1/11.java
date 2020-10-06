// 11.	Write a program to swap two numbers without using third variable.
import java.util.Scanner;
class swap{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int first = sc.nextInt();
        int second = sc.nextInt();
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println("Num1 = "+first);
        System.out.println("Num2 = "+second);
    }
}