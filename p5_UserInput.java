import java.util.Scanner;

public class p5_UserInput
{
    public static void main(String[] args) {
        //With the help of Scanner class we take the user input, in Java5 it come into play

        Scanner scObj= new Scanner(System.in);
        System.out.println("Please Enter your name:");
        String name=scObj.nextLine();//input string
        System.out.println("Good Morning "+name);

    }
}
