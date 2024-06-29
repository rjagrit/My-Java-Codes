import java.util.Scanner;

public class p8_ArithmeticOperations
{
    static void miniCalculator(int n1,int n2)
    {
        int addnum= n1+n2;
        int subnum= n1-n2;
        int divnum= n1/n2;
        int mulnum= n1*n2;
        int modnum= n1%n2;

        System.out.println("Addition of Two Numbers are:"+addnum);
        System.out.println("Subtraction of Two Numbers are:"+subnum);
        System.out.println("Division of Two Numbers are:"+divnum);
        System.out.println("Modulus of Two Numbers are:"+modnum);
        System.out.println("Multiplication of Two Numbers are:"+mulnum);
    }

    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter First Number:");
        int num1= obj.nextInt();
        System.out.print("Enter Second Number:");
        int num2= obj.nextInt();
        miniCalculator(num1,num2);

    }
}
