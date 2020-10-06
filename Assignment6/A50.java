//50.	Explain the importance of toString() and equals() method of the Object class and override them 
//on class Employee(empId,name,salary).  
//a. Create class for main method(say XYZ),and accept five employees information and store in an array.
//Also ensure if entered empId already exist or not (use equals method).  
//b. Display all employee info using toString method.

package Asgmt;

class Employee2
{
	int empid;
	String name;
	public Employee2(int empid, String name) 
	{
		super();
		this.empid = empid;
		this.name = name;
	}
	
}

public class A50 {

	public static void main(String[] args) {
		Employee2 e=new Employee2(1001, "Krishna");
		System.out.println(e);					
	}
}

package Asgmt;

class Employee2
{
	int empid;
	String name;
	public Employee2(int empid, String name) 
	{
		super();
		this.empid = empid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee2 [empid=" + empid + ", name=" + name + "]";
	}
	
	
}

public class A50 {

	public static void main(String[] args) {
		Employee2 e=new Employee2(1001, "Krishna");
		System.out.println(e);					
	}
}




package Asgmt;

class Employee2
{
	int empid;
	String name;
	public Employee2(int empid, String name) 
	{
		super();
		this.empid = empid;
		this.name = name;
	}
	
}

public class A50 {

	public static void main(String[] args) {
		Employee2 E1 = new Employee2(1001, "Krishna");
		Employee2 E2 = E1;
		Employee2 E3 = new Employee2(1002, "Krishna");
		System.out.println(E1.equals(E2));
		System.out.println(E1.equals(E3)); 
	}
}