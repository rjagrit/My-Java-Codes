import java.util.Scanner;

public class p18_OperatorsExamples
{
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        int num1= obj.nextInt();
        System.out.print("Enter second number:");
        int num2= obj.nextInt();

        System.out.println("Bitwise and(&) of "+num1+" and "+num2+" is:"+(num1&num2));
        System.out.println("Bitwise Or(|) of "+num1+" and "+num2+" is:"+(num1|num2));
        System.out.println("Bitwise XOR(|) of "+num1+" and "+num2+" is:"+(num1^num2));
        System.out.println("Negation of "+num1+" and "+num2+" is:"+(~num1)+"and"+(~num2));
        System.out.println("Left Shift of "+num1+ " is "+ (num1<<4) );//num multiplied by 2 and count of 2 = number of shift you want
        System.out.println("Right Shift of "+num1+ " is "+ (num1>>4) );//num division by by 2 and count of 2 = number of shift you want


    }
}
