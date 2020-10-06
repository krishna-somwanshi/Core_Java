//41.	Write a program to demonstrate this() construct functionality.
package Asgmt;

class A{
	int id;
	String name;
	public A(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	void show() {
		System.out.println(id+" "+name);
	}
	
}

public class A41 {
	public static void main(String[] args) {
		A a = new A(1,"krishna");
		a.show();
		
	}
}
