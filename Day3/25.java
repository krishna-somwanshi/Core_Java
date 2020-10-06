// 25.	Write the program to find the sum of even elements and sum of odd elements
//  present in the array of integer type.
import java.util.Scanner;
class Demo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int even = 0;
        int odd = 0;
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(arr[i]%2==0){
                even = even + arr[i];
            }
            else{
                odd = odd + arr[i];
            }
        }
               System.out.println("Sum of Even Elements "+even);
                System.out.println("Sum of odd Elements "+odd);
    }
}