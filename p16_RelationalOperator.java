import java.util.Scanner;

public class p16_RelationalOperator
{
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Welcome to Driving Licence Portal");
        System.out.print("Please Enter your Age:");
        int age= obj.nextInt();
        if(age>=18){
            System.out.println("You are eligible to apply the licence");
        }
        else
            System.out.println("You are not eligible for Licence");
    }
}
