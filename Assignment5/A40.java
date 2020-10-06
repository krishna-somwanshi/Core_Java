//a class Student having data members name, roll no., age and score. 
//Write a program to accept 10 records of student and store them in an array.
//And then arrange the student records based on the score 
//group [0-50], [50-65], [65-80], [80-100].

package Asgmt;

import java.util.*;

class student{
	int rollno;
	int age; 
	float score;
	String name;
	
	public student(int rollno, int age, float score, String name) {
		super();
		this.rollno = rollno;
		this.age = age;
		this.score = score;
		this.name = name;
	}


	static float group(Product []p)
	{
		Product test;
		float sum=0;
		for(int i=0; i<p.length; i++)
		{
			test=p[i];
			sum=sum+(test.quantity*test.price);
		}
		return sum;
	}
}
public class A40 {
	
	public static void main(String[] args) {
		
		int roll,age;
		float score;
		String name;
		Scanner scan=new Scanner(System.in);
		student s[]=new student[10];
		student test;
		
		for(int i=0; i<4; i++)
		{
			System.out.println("Enter roll, name, age and score:");
			roll=scan.nextInt();
			name=scan.next();
			age=scan.nextInt();
			score=scan.nextFloat();
			
			student s1=new student(roll,age,score,name);
			s[i]=s1;
			
		}
		
		System.out.println("Students score 80-100 = ");
		for(int i=0; i<4; i++)
		{
			if(s[i].score>=80 && s[i].score<=100)
			{
				System.out.println(s[i].rollno+" "+s[i].name+" "+s[i].age+" "+s[i].score);
			}
		}
		
		System.out.println("Students score 65-80 = ");
		for(int i=0; i<4; i++)
		{
			if(s[i].score>=65 && s[i].score<80)
			{
				System.out.println(s[i].rollno+" "+s[i].name+" "+s[i].age+" "+s[i].score);
			}
		}
		
		System.out.println("Students score 50-65 = ");
		for(int i=0; i<4; i++)
		{
			if(s[i].score>=50 && s[i].score<65)
			{
				System.out.println(s[i].rollno+" "+s[i].name+" "+s[i].age+" "+s[i].score);
			}
		}
		
		System.out.println("Students score 45-50 = ");
		for(int i=0; i<4; i++)
		{
			if(s[i].score>=45 && s[i].score<50)
			{
				System.out.println(s[i].rollno+" "+s[i].name+" "+s[i].age+" "+s[i].score);
			}
		}
		
	}
}
