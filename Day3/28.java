// 28.	Initialize one String type of array and print the elements using for each loop.
import java.util.Scanner;
class Demo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = {"Mumbai","Delhi","Pune"};
        for( String ele : arr){
            System.out.println(ele);
        }
    }
}