import java.util.Scanner;

public class p11_AreaOfTriangle
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Breadth and Height");
        System.out.print("Breadth:");
        double breadth= obj.nextDouble();
        System.out.print("Height:");
        double height= obj.nextDouble();
        double result= 0.5 * breadth *height;
        System.out.println("Area of Triangle:"+result);
    }
}
