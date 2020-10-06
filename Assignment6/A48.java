//48.	Create an Abstract class Processor with int member variable data  and method showData to 
//display data value. Create abstract method process() to define processing of member data.
//Create a class  Factorial using abstract class Processor  to calculate and print factorial 
//of a number by overriding the process method. b. Create a class Circle using abstract class 
//Processor to calculate and print area of a circle by overriding the process method.
//Ask user to enter choice (factorial or circle area).  Also ask data to work upon. 
//Use Processor class reference to achieve this mechanism. 
package Asgmt;

import java.util.Scanner;

abstract class Processor
{
	int data=1;
	void showData()
	{
		System.out.println(data);
	}
	abstract void process(int num);
}

class Factorial extends Processor
{
	void process(int num) 
	{
		for(float i=num; i>=1; i--)
		{
			data*=i;
		}
	}
}

class Circle extends Processor
{
	void process(int num) 
	{
		int area=(int)3.14f*num*num;
		data=area;
	}
}
public class A48 {

	public static void main(String[] args) {
		System.out.println("Enter your choice: 1) Factorial 2) Area of circle");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		Processor p1=new Factorial();
		Processor p2=new Circle();
		
		switch(c)
		{
			case 1:
			{
				int num1;
				System.out.print("Enter a number: ");
				num1=sc.nextInt();
				p1.process(num1);
				p2.showData();
				break;				
			}
			case 2:
			{
				int num2;
				System.out.print("Enter a number: ");
				num2=sc.nextInt();
				p2.process(num2);
				p2.showData();
				break;
			}
			default:
			{
				System.out.print("Inavlid Choice!!");
			}
		}
	}
}