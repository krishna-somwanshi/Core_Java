// 30.	Create an integer type 2-D array of size [3X3]. Take the elements from the user 
// and then calculate the sum of the elements present in the diagonal.
import java.util.Scanner;
class Demo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int sum = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
                sum = sum + arr[i][i];
        }
        System.out.println("Sum of diagonal Elements = "+sum);
    }
}