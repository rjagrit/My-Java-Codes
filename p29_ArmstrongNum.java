import java.util.Scanner;

public class p29_ArmstrongNum
{
    public static boolean isArmstring(int num)
    {
        int noOfdigits= numOfDigit(num);
        int finalNum=0;
        int numCopy= num;
        while(num>0)
        {
            int lastdigit = num %10;
            num = num /10;
            finalNum = finalNum + powerOfDig(lastdigit,noOfdigits);
        }
        return finalNum == numCopy;
    }

    public static int numOfDigit(int num)
    {
        int dig=0;
        while(num>0)
        {
            dig++;
            num = num/10;
        }
        return dig;
    }

    public static int powerOfDig(int num1,int num2)
    {
        int res = 1;
        int i = 0;
        while(i<num2)
        {
            res= res * num1;
            i++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num= obj.nextInt();
        boolean isArmstng= isArmstring(num);
        if(isArmstng)
            System.out.println("Your Number is Armstrong");
        else
            System.out.println("Your Number is not a Armstrong Number");
    }
}
