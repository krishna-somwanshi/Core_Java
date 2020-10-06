// 08.	Write a program to find the simple interest. 
// Take the principle amount, rate of interest and time from user using Scanner class.
//  SI = P × R × T/100.
import java.util.Scanner;
class Simple{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle Amount");
        int principle = sc.nextInt();
        System.out.println("Enter rate of Interest Amount");
        int rate = sc.nextInt();
        System.out.println("Enter Time Amount");
        int time = sc.nextInt();
        int SI = (principle*rate*time/100);
        System.out.println("Simple Interest = "+SI);
    }
}