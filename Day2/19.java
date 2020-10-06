// 19.	Calculate  series : 12+22+32+42+.........+n2
import java.util.Scanner;
class Demo1{
    public static void main(String[] args) {
	int val=12,sum=0;
	for(int i=1; i<10; i++)
	{
		sum=val+sum;
		val=val+10;
	}
	System.out.println("Sum: "+sum);
    }
}