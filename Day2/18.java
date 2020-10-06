// 18.	Program to check whether number is prime or not.
import java.util.Scanner;
class Demo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = sc.nextInt();
        boolean isPrime=true;
        int temp=0;
        for(int i=2;i<=num/2;i++)
	    {
            temp=num%i;
	        if(temp==0)
	        {
	            isPrime=false;
	            break;
	        }
	    }
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }
}