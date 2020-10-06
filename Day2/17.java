// 17.	Write a program to reverse a given number.
import java.util.Scanner;
class Demo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = sc.nextInt();
        int reversed=0;
        while(num != 0)
        {
            int rem = num % 10;
            reversed = reversed * 10 + rem;
            num /= 10;
        }
        System.out.println("Reverse Number is "+ reversed);
    }
}