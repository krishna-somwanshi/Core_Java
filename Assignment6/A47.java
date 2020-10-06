//47.	Create a program to demonstrate constructor chaining. 
package Asgmt;
class animal
{
	animal()
	{
		this(10,20);
		System.out.println("non-parameterized animal");	//3
	}
	animal(int a)
	{
		System.out.println("One parameterized of animal");  //1
	}
	animal(int a1,int a2)
	{
		this(30);
		System.out.println("Two parameterized of A");  //2
	}
}

class dog extends animal
{
	dog()
	{
		this(10);
		System.out.println("In non-parameterized of dog");   //5
	}
	dog(int b)
	{
		System.out.println("one parameterized of dog");  //4
	}
}
public class A47 {

	public static void main(String[] args) {
		dog obj=new dog();
	}
}