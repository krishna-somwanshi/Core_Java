//  31.	Create a class Student with 2 data members rno and name.
//  Create one method setData() that takes roll number and student name as parameter and
//   stores them in data members rno and name. Create one more method showData() 
//   to print the data member values. Create another class ( main class) StudentDemo 
//   that creates Student class object and calls setData() and showData() methods.

import java.util.Scanner;
class Student{
    Scanner sc = new Scanner(System.in);
    int rno;
    String name;
    void setData(){
        System.out.println("Enter the roll number and student name");
        rno = sc.nextInt();
        name = sc.next();
    }
    void showData(){
        System.out.println(rno+" "+name);
    }
}
class StudentDemo{
    public static void main(String args[]){
        Student s = new Student();
        s.setData();
        s.showData();
    }
}