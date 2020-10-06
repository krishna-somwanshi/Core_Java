// 45.	Create a class Student with two members : rollno and percentage. 
//Create default and parameterized constructors. Create method show() to display information.
//Create another class CollegeStudent inherits Student class. 
//Add a new member semester to it. Create default and parameterized constructors.
//Also override show() method that calls super class show() method and displays semester. 
//Create another class SchoolStudent inherits Student class. Add a new member 
//className(eg 12th ,10th etc.) to it. Create default and parameterized constructors. 
//Also override show() method that calls super class show() method and displays className. 
//Create a class( say Demo) with main method that carries out the operation of the 
//project : -- has array to store objects of any class(Student,  CollegeStudent or 
//SchoolStudent) --create two CollegeStudent  and three SchoolStudent objects 
//and store them inside the array -- display all records from the array -- search record 
//on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent. 
//--count how many students are having A grade, if for A grade percentage >75. 
package Asgmt;

import java.util.Scanner;

class Student1
{
	int roll;
	float per;
	Student1()
	{
		roll=1;
		per=60f;
	}
	Student1(int roll,float per)
	{
		this.roll=roll;
		this.per=per;
	}
	void show()
	{
		System.out.println("Roll = "+roll);
		System.out.println("Per = "+per);
	}
}


class CollegeStudent extends Student1
{
	int sem;
	
	CollegeStudent()
	{
		sem=1;
	}
	CollegeStudent(int roll, float per,int sem)
	{
		super(roll,per);
		this.sem=sem;
	}
	
	void show()
	{
		super.show();
		System.out.print("Sem = "+sem);
	}
}


class SchoolStudent extends Student1
{
	String className;
	SchoolStudent()
	{
		className="CS";
	}
	SchoolStudent(int roll, float per,String className)
	{
		super(roll,per);
		this.className=className;
	}
	
	void show()
	{
		super.show();
		System.out.print("Class Name = "+className);
	}
}


public class A45 {

	public static void main(String[] args) {
		int hold = 0;
		CollegeStudent c1 = new CollegeStudent(1000,88.18f,2);
		CollegeStudent c2 = new CollegeStudent(1001,90.0f,3);
		SchoolStudent s1 = new SchoolStudent(1001,91.00f,"Science");
		SchoolStudent s2 = new SchoolStudent(1002,84.15f,"Commerce");
		SchoolStudent s3 = new SchoolStudent(1003,70.91f,"Arts");
		
		Student1 ar[]=new Student1[]{c1,c2,s1,s2,s3};
		
		for(Student1 ref: ar)
		{
			ref.show();
		}
		
		Scanner scan=new Scanner(System.in);
		System.out.print("\n Enter roll no = ");
		int rollno=scan.nextInt();
		
		for(Student1 ref: ar)
		{
			if(rollno==ref.roll)
			ref.show();
		}
		
		for(Student1 ref: ar)
		{
			if(ref.per>75)
			hold++;
		}
		System.out.print("Students with grade A = "+hold);
	}
}
