import java.util.Scanner;

public class p30_PalindromeNumber
{
    public static int revdgt(int num)
    {
        int res=0;
        while(num>0)
        {
            int digit = num%10;
            res=res*10+digit;
            num = num/10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num = obj.nextInt();
        int val=revdgt(num);
        if(num==val)
            System.out.println(num+" is a Palindrome Number");
        else
            System.out.println(num+" is not a palindrome number");

    }
}
