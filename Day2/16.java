// 16.	Write a program to print table of any entered number using loop.
import java.util.Scanner;
class Demo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number to print Table");
        int num = sc.nextInt();
        int hold = num;
        System.out.println("Table For "+num+" is");
        for(int i=1;i<=10;i++)
        {
            num = hold*i;
            System.out.println(num);
        }
    }
}