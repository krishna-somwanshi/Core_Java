//46.Create a program to demonstrate the use of instanceof operator or secure reference down casting. 
package Asgmt;

class human{
	int age;
	String name;
	
	human(int age,String name) {
		super();
		this.age = age;
		this.name = name;
	}
	void display(){
		System.out.println("name = "+name);
		System.out.println("age = "+age);
	}
}
class man extends human{
	String city;

	public man(int age, String name, String city) {
		super(age, name);
		this.city = city;
	}
	void display(){
		super.display();
		System.out.println("city = "+city);
	}
}

public class A46 {

	public static void main(String[] args) {
		
		human h[] = {new man(24, "krishna","latur"),new man(21, "Bals","pune")};
		
		for(human a : h) {
			if(a instanceof human) {
				man m = (man)a;
				a.display();
			}
		}
	}
}
