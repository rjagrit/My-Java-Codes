import java.util.Scanner;

public class p12_SimpleInterest
{
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the Principle Amount Rs:");
        int principle= obj.nextInt();
        System.out.print("Now, Tell me your rate of interest:");
        float rate= obj.nextFloat();
        System.out.print("Now, tell me for how many years are you borrowing:");
        float years= obj.nextFloat();

        float interest= (principle * rate * years)/100;
        System.out.println("\nYour Simple Interest is Rs:"+interest);

    }
}
