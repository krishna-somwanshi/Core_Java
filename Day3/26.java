// Incomplete


// 26.	Create an array of 17 elements in 5 rows.  And calculate sum of all elements.
import java.util.Scanner;
class Demo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
         int [][] arr = {{5,3,6,4},
                         {1,5,2,3},
                         {5,6,8,9},
                         {5,6,3,1},
                         {10}};
         for(int i=0;i<5;i++){
             for(int j=0;j<5;j++){
                sum = arr[i][j];
             }
         }
         System.out.println(sum);
    }
}













// import java.util.Scanner;
// class Demo1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter The Number");
//          int[][] arr = new int[4][4];
//          for(int i=0;i<5;i++){
//              for(int j=0;j<5;j++){
//              arr[i][j] = sc.nextInt();
//             }       
//          }
//          for(int i=0;i<5;i++){
//              for(int j=0;j<5;j++){
//                 System.out.println(arr[i][j]);
//              }
//          }      
//     }
// }