// 32.	Modify the above program (no. 30) to count the no of Student objects created.
//  [ In this program static variable is required ]
import java.util.Scanner;
class Student{
    Scanner sc = new Scanner(System.in);
    static int counter = 0;
    int rno;
    String name;
    void studentCount(){
           counter++;
    }
    void setData(){
        System.out.println("Enter the roll number and student name");
        rno = sc.nextInt();
        name = sc.next();
    }
    void showData(){
        System.out.println(rno+" "+name);
        System.out.println("Number of object created = "+counter);
    }
}
class StudentDemo{
    public static void main(String args[]){
        Student s = new Student();
        s.studentCount();
        s.setData();
        s.showData();
        Student s1 = new Student();
        s1.studentCount();
        s1.setData();
        s1.showData();
    }
}