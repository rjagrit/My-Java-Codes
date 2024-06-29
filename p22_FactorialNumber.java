import java.util.Scanner;

public class p22_FactorialNumber
{
    public static long factorial(int num)
    {
        if(num<2)
            return 1;

        long fact=1;
        int i=2;
        while(i<=num)
        {
            fact = fact * i;
            i++;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the Number that you want to find the Factorial:");
        int num= obj.nextInt();
        long result= factorial(num);
        System.out.println("Factorial of "+num+" is "+result);
    }
}
