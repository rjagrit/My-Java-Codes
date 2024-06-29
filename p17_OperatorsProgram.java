import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class p17_OperatorsProgram
{
    static void checkPosNegNum(int num)
    {
        if(num==0)
            System.out.println("You entered Digit Zero");
        else if (num>0) {
            System.out.println(num+" is Positive Number");
        }
        else
            System.out.println(num+" is Negative Number");
    }
    static void oddEven(int num2)
    {
        if(num2%2==0)
            System.out.println(num2+" is a Even Number");
        else
            System.out.println(num2+" is a Odd Number");

    }
    static void greatestOfThreeNumber(int num1,int num2,int num3)
    {
        if(num1>=num2 && num1>=num3 )
        {
                System.out.println(num1+" is greater than "+num2+" and "+num3);
        }
        else if(num2>=num1 && num2>=num1)
            System.out.println(num2+" is greater than "+num1+" and "+num3);
        else
            System.out.println(num3+" is greater than "+num1+" and "+num2);
    }

    static void checkLeapYear(int y){
        //condition is that divisible by 4 but not by 100, unless also divisible by 400
        if(y%400==0 || (y%4==0 && y%100!=0))
            System.out.println(y+" is a leap year");
        else
            System.out.println(y+" is not a leap year");
    }

    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        /*
        System.out.print("Enter 1st digit:");
        int number1= obj.nextInt();
        System.out.print("Enter 2nd digit:");
        int number2= obj.nextInt();
        System.out.print("Enter 3rd digit:");
        int number3= obj.nextInt();
         */

        System.out.print("Enter the year:");
        int year= obj.nextInt();
//        checkPosNegNum(number);
//        oddEven(number);
//        greatestOfThreeNumber(number1,number2,number3);
//        checkLeapYear(year);
    }
}
