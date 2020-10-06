// 13.	Program to find greatest in 3 numbers. 
// [ once using if else statement and then using ternary operator ( logical operator) ]  
import java.util.Scanner;
class greatest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println("Greatest Number = "+n1);
        }
        if(n2>n1 && n2>n3){
            System.out.println("Greatest Number = "+n2);
        }
        if(n3>n2 && n3>n1){
            System.out.println("Greatest Number = "+n3);
        }
    }
}

