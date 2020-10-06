// 15.	Accept person’s gender (character m for male and f for female), age (integer), as input and 
// then check whether person is eligible for marriage or not.
    import java.util.Scanner;
    class Demo1{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Gender");
        char c = sc.next().charAt(0);
        System.out.println("Enter Age");
        int age = sc.nextInt();
        if(age>18 && c=='f')
        {
            System.out.println("eligible for marriage");
        }
        else if(age>21 && c=='m')
        {
            System.out.println("eligible for marriage");
        }
        else
        {
            System.out.println("Not eligible for marriage");
        }
    }
}    