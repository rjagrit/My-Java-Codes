import java.util.Scanner;

public class p9_FloatMultiplication
{
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter 1st Num:");
        double d1= obj.nextDouble();
        System.out.println("Enter 2nd Num:");
        double d2= obj.nextDouble();
        double doubleMultResults= d1*d2;
        System.out.println(doubleMultResults);
    }
}
