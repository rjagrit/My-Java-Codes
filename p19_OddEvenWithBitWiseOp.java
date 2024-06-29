import java.util.Scanner;

public class p19_OddEvenWithBitWiseOp
{
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Please enter your number:");
        int num= obj.nextInt();
        if ((num & 1)==1)
            System.out.println("Number is odd");
        else
            System.out.println("Number is even");
    }
}
