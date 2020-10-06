// 21.	Program to show sum and average of 10 element array. Accept array elements from user. 
import java.util.Scanner;
class Demo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int num=0;
        int num1=0;
        for(int i=0;i<10;i++){
            System.out.println("Enter The Number");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            num = arr[i] + num;
        }
        for(int i=0;i<10;i++){
            num1 = arr[i] + num1;
        }
        System.out.println("Sum Of array Elements = "+num);
        num1 = num1/10;
        System.out.println("Average Of array Elements = "+num1);
    }
}