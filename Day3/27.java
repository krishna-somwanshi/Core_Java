// 27.	Write a program to fine the smallest and greatest number present in the array of integer type.
import java.util.Scanner;
class Demo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {16,31,63,13,31,37,56,97,4,61,31,94,97,94,61,36};
        int smallest = arr[0];
        int greatest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
            if(greatest < arr[i]){
                greatest = arr[i];
            }
        }
            System.out.println("Smallest Element of Array is "+smallest);
            System.out.println("Largest Element of Array is  "+greatest);
    }
}