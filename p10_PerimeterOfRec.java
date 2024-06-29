import java.util.Scanner;

public class p10_PerimeterOfRec
{
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter All side values");
        System.out.print("Side-1:");
        int s1=obj.nextInt();
        System.out.print("Side-2:");
        int s2=obj.nextInt();
        System.out.print("Side-3:");
        int s3=obj.nextInt();
        System.out.print("Side-4:");
        int s4=obj.nextInt();
        System.out.println("Perimeter of Rectangle is: "+(s1+s2+s3+s4));
    }
}
