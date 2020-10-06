//44.	Create three classes
//-	Faculty with two data members facultyId and salary and two methods, one intput()
//method for accepting facultyId as input and another printSalary() to print salary.
//-	FullTimeFaculty that inherits class Faculty with two data members’
//basicSalary and allowance. Override input() method in this class that calls 
//super class inut() method and accepts basicSalary and allowance as input.
//Salary should not be accepted as input but should be calculated using formula 
//(basicSalary + allowance)
//-	PartTimeFaculty that inherits class Faculty with two data members’ workingHours,
//ratePerHour. Override input() method in this class that calls super class inut()
//method and accepts workingHours and ratePerHour as input. Salary should not be 
//accepted as input but should be calculated using formula ( workingHour * ratePerHour )

package Asgmt;

class Faculty{
	int facultyId;
	int salary; 
	void intput(int facultyId) {
		this.facultyId = facultyId;
	}
	void intput(int facultyId, int basicSalary, int allowance) {
		intput(facultyId);
	}
	void printSalary() {
		System.out.println(salary);
	}
}

class FullTimeFaculty extends Faculty{
	int basicSalary;
	int allowance;
	int sum;
	
	@Override
	void intput(int facultyId, int basicSalary,  int allowance){
		this.basicSalary = basicSalary;
		this.allowance = allowance;
		sum = basicSalary + allowance;
		
	}
}
public class A44 {
	public static void main(String[] args) {
		
		
		
	}
}