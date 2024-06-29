import java.util.Scanner;

public class p23_SumOfDigits
{
    public static int sod(int num)
    {
        int res=0;
        while(num>0)
        {
            res = res+num % 10;
            num = num / 10;
        }
        return res;
    }
    public static void main(String[] args) {
    Scanner obj= new Scanner(System.in);
    System.out.print("Enter the Number:");
    int num = obj.nextInt();
    int result= sod(num);
    System.out.println("Result = "+result);
    }
}
