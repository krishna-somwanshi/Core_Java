// 12.	In a company an employee is paid as under: If his basic salary is less than Rs. 10000,
// then HRA = 10% of basic salary and DA = 90% of basic salary.
// If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary.
// If the employee's salary is input by the user write a program to find his gross salary.
//  [ formula : GS= Basic + DA + HRA ]
import java.util.Scanner;
class hra{
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Basic");
            int Basic = sc.nextInt();
            System.out.println("Enter DA");
            int DA = sc.nextInt();
            System.out.println("Enter HRA");
            int HRA = sc.nextInt();
            int GS = Basic + DA + HRA;
            System.out.println("GS = "+GS);
    }
}