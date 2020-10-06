// 23.	Write a program to reverse the array elements
import java.util.Scanner;
class Demo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int arr1[] = new int[10];
        int temp;
        for(int i=0;i<10/2;i++){
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }
}