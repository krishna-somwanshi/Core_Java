// 07.	Write a program to calculate sum of 5 subject’s marks & find percentage.
//  Take the obtained marks from user using Scanner class. 
//  Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.
import java.util.Scanner;
class percentage{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mars for 5 subjects");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        int all = (sub1+sub2+sub3+sub4+sub5)/5;
        System.out.println("Percentage = "+all);
    }
}