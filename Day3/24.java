// 21.	24.	Write a program to search an element in the array.
import java.util.Scanner;
class Demo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter elements in Array");
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Element to search");
        int ele = sc.nextInt();
        for(int i=0;i<10;i++){
            if(ele == arr[i]){
                System.out.println("Searched Element is "+arr[i]);
            }
        }
    }
}