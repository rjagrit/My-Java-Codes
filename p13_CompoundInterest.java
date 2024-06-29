import java.util.Scanner;

public class p13_CompoundInterest
{
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the Principle Amount Rs:");
        int principle= obj.nextInt();
        System.out.print("Now, Tell me your rate of interest:");
        float rate= obj.nextFloat();
        System.out.print("Now, tell me for how many years are you borrowing:");
        float years= obj.nextFloat();

        double comInt= principle*Math.pow((1+rate /100), years);
        System.out.print(comInt);
    }
}
