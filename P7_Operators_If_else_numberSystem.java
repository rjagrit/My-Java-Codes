import java.util.Scanner;

public class P7_Operators_If_else_numberSystem
{
    public static void main(String[] args) {
        int a=6;//Assignment Operator
        int j=a;

        //Q. Swap of two numbers
        Scanner obj= new Scanner(System.in);
        /*
        System.out.print("Enter First Number:");
        int fnum= obj.nextInt();
        System.out.print("Enter second Number:");
        int snum= obj.nextInt();
        System.out.println("Before Swapping:Num1="+fnum+" and Num2="+snum);

        int swap=snum;
        snum=fnum;
        fnum=swap;
        System.out.println("After Swapping:Num1="+fnum+" and Num2="+snum);

     */
/*
        System.out.println("Arithmetic");
        System.out.print("Enter First Number:");
        int fnum= obj.nextInt();
        System.out.print("Enter second Number:");
        int snum= obj.nextInt();
        System.out.println(fnum+snum);
        System.out.println(fnum-snum);
        System.out.println(fnum/snum);
        System.out.println(fnum*snum);
        System.out.println(fnum%snum);

 */

        //Always use BODMAS and PEMDAS rule (----->) always solve the expression like that
        System.out.println(441/3/3);

        //Shorthand operators
        int v=5;
        v+=6;
        v-=7;
        v*=100;
        v/=10;
        v%=2;
        System.out.println(v);

        //Unary operators
        int num=8;
        System.out.println(-num);
        System.out.println(++num);
        System.out.println(num++);
        System.out.println(--num);



    }
}

