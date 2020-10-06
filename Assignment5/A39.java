//39.	Create class Product with three data members (pid, price, quantity) and 
//parameterized constructor that takes values for all three data members.  
//Create a main method in different class (say ProductDemo) and perform following task:
//a. Accept information for five Product objects from user and store objects in an array
//b. Find pid of product with highest price. 
//c. Create a static method (with array of product’s object as argument) in Product class 
//to calculate and return total amount spent on all products. 
//( amount spent on single product = price of product * quantity of product )

package Asgmt;

class Product{
	int pid;
	int quantity;
	float price;
	
	public Product(int pid, int quantity, float price) {
		super();
		this.pid = pid;
		this.quantity = quantity;
		this.price = price;
	}
	
	static float total(Product []p)
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



public class A39 {

	public static void main(String[] args) {
		Product p1=new Product(1,2,200);
		Product p2=new Product(3,2,400);
		Product p3=new Product(4,2,100);
		Product p[]=new Product[]{p1,p2,p3};
		Product test;
		float price[]=new float[p.length];
		for(int i=0; i<p.length; i++)
		{
			test=p[i];
			price[i]=test.price;
		}
		float max=0;
		for(int i=0; i<price.length; i++)
		{
			if(max<price[i])
			{
				max=max+price[i];
				price[i]=max-price[i];
				max=max-price[i];
			}
		}
		System.out.println("highest price = "+max);

		for(int i=0; i<p.length; i++)
		{
			test=p[i];
			if(max==test.price)
			{
				System.out.println("pid of highest price = "+test.pid);
			}
		}
		
		float T=Product.total(p);
		System.out.println("amount spent = "+T);

	}

}
