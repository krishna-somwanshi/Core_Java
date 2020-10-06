// 33.	Write a program to demonstrate functionalities of this keyword in java. 
class Student{
    Student(){
        this(5);
        System.out.println("Class");
    }
    Student(int x){
        System.out.println("roll");
    }
}
class StudentDemo{
    public static void main(String args[]){
        Student s = new Student();
    }
}