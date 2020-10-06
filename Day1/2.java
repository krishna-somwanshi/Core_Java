// 02.	Write a program to declare a variable named rollNo of integer type. 
// Assign it a value (let say 100) to it and print the following statement roll no = 100 .
import java.util.Scanner;
class demo{
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("roll no = "+num);
    }
}