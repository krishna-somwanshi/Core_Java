// 05.	Write a program that takes user’s name as command line argument and prints Welcome <entered user name>.
import java.util.Scanner;
class Ass1{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the name");  
                String name = sc.next();
                System.out.println("Welcome "+name);
        }
}