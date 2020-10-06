//Create a class Employee with three data members (empNo, salary and totalSalary) 
//and following features.
//a. Only parameterized constructor. [Do not overload the constructor]
//b. totalSalary always represents salary total of all the employees created.
//c. empNo should be auto incremented.
//d. display total employees and totalSalary using a method.
//Create another class EmployeeDemo (main class) that creates some Employee objects and 
//calls Employee method to display no. of employees and total of their salaries.
package Asgmt;

class Employee{
	static int empno=0;
	static float salary=0;
	
	Employee(int salary)
	{
		empno++;
		this.salary += salary;
	}
	
	void display()
	{
		System.out.println("Total employees: "+empno);
		System.out.println("Total salary: "+salary);
	}
}

public class A38 {

	public static void main(String[] args) {
		Employee e1 = new Employee(10000);
		Employee e2 = new Employee(3000);
		Employee e3 = new Employee(5000);
		e1.display();
	}
}