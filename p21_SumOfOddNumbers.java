import java.util.Scanner;

public class p21_SumOfOddNumbers
{
    public static int sumoddnum(int num)
    {
        int i=1;
        int result=0;
        while (i<=num)
        {
            if(i%2!=0)
                result+=i;
            i++;
        }
       return result;
    }
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the number upto which you want Sum of Odd Numbers:");
        int num= obj.nextInt();
        int res= sumoddnum(num);
        System.out.println("Sum of Odd Numbers upto "+num+" are "+res);
    }
}
