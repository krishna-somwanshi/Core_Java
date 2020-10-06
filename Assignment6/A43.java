//43.Create a class OneBHK with instance variables roomArea, hallArea and price. 
//Then create default constructor that initializes instance variables with some 
//values and a parameterized constructor that takes values for all instance variables 
//and stores them in instance variables. Now create a method named show()  to print 
//OneBHK’s instance variable values.
//Create another class TwoBHK which has (inherites) all the properties and behaviors 
//of OneBHK and a new instance variable room2Area. Then create default constructor to 
//initialize all 4 instance variables and a parameterized constructor to take the values 
//for initialization of all instance variables. Override show() method to print all data 
//member information.
//Write main method in another class (Say Demo) and store three TwoBHK flat’s information 
//and print information using show method. Also print total amount of all flats. 

package Asgmt;

class OneBHK{
	float roomArea;
	float hallArea;
	float price;
	
	OneBHK(){
		roomArea = 150;
		hallArea = 250;
		price = 15000;
	}
	
	OneBHK(float roomArea,float hallArea,float price){
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
	}
	void show()
	{
		System.out.println(roomArea);
		System.out.println(hallArea);
		System.out.println(price);
	}	
}
class TwoBHK extends OneBHK{
	float Area;
	static float add=0;
	TwoBHK()
	{
		Area=100;
	}
	TwoBHK(float roomArea,float Area,float hallArea,float price)
	{
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.Area=Area;
		this.price=price;
		
		add+=price;
	}
	void show()
	{
		System.out.println("Room Area = "+roomArea);
		System.out.println("Room Area = "+Area);
		System.out.println("Hall Area = "+hallArea);
		System.out.println("Price = "+price);
	}	
}

public class A43 {
	public static void main(String[] args) {
		float add;
		TwoBHK T1 =new TwoBHK(100,100,200,10000);
		TwoBHK T2 =new TwoBHK(200,200,300,20000);
		TwoBHK T3 =new TwoBHK(300,300,400,30000);
		System.out.println("1st Flat = ");
		T1.show();
		System.out.println("2nd Flat = ");
		T2.show();
		System.out.println("3rd Flat = ");
		T3.show();
		
		add=TwoBHK.add;
		System.out.println("\n\n Total price : "+add);
	}
}
