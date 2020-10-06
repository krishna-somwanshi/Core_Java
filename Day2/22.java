// 21.	22.	Sort a ten element array in descending order.
import java.util.Scanner;
class Demo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        // int arr[] = {10,16,96,9,1,3,31,6,60,4,1,31};
        int arr[] = new int[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter Array Elements");
            arr[i] = sc.nextInt();
        }
           for (int i = 0; i < 10; i++) {     
                for (int j = i+1; j < 10; j++) {     
                   if(arr[i] < arr[j]) {    
                       temp = arr[i];    
                        arr[i] = arr[j];    
                        arr[j] = temp;    
                    }     
                }     
            }    
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }
}