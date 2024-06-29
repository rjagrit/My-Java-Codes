import java.util.Scanner;

public class p14_FarenheitToCelsius
{
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Welcome to Temperature converter");
        System.out.println("Enter your temp in F");
        float fah= obj.nextFloat();
        double cel= (fah-32) * 5 / 9 ;
        System.out.println("Your temperature is: "+cel+" C");
    }
}
