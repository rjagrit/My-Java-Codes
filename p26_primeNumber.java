import java.util.Scanner;

public class p26_primeNumber
{
    public static int prime(int num)
    {
        int i=2;
        int flag=0;
        while(i<num)
        {
            if(num%i==0)
                flag=1;
            i++;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num= obj.nextInt();
        int res= prime(num);
        if(res==0)
            System.out.println("Number is a Prime Number");
        else
            System.out.println("Number is not a Prime Number");
    }
}
