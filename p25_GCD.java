import java.util.Scanner;

public class p25_GCD
{
    public static int gcd(int n1,int n2)
    {
        int gcd=1;
        int i=2;
        int least= least(n1,n2);

        while(i<=least) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;

    }

    public static int least(int num1, int num2)
    {
        if(num1<num2)
            return num1;
        else
            return num2;
    }
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter first Number:");
        int num1= obj.nextInt();
        System.out.print("Enter second number:");
        int num2= obj.nextInt();
        int res= gcd(num1,num2);
        System.out.println("Greatest Common Divisor (GCD) of "+num1+" and "+num2+" is "+res);
    }
}
