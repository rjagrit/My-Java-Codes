import java.util.Scanner;

public class p20_MultiplicationTable
{
    public static void mulResult(int n)
    {
//        for(int i=1;i<=10;i++)
//        {
//            System.out.println(n+" X "+i+" = "+(n*i));
//        }
        int i=1; //initialization
        while(i<=10)
        {
            System.out.println(n+" X "+i+" = "+(n*i));
            i++;
        }
    }

    public static void main(String[] args) {
    Scanner obj= new Scanner(System.in);
    System.out.print("Enter the Number for which you want to print the Table:");
    int num= obj.nextInt();
    mulResult(num);
    }
}
