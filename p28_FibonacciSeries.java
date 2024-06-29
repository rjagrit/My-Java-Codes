import java.util.Scanner;

public class p28_FibonacciSeries
{
    public static void fact(int num)
    {
        if(num<0)
            return;
        System.out.print("0 ");
        if(num==0)
            return;
        System.out.print("1 ");

        int firstnum=0;
        int secondnum=1;
        int thirdnum;
        while(firstnum + secondnum<=num) {
            thirdnum = firstnum + secondnum;
            System.out.print(thirdnum + " ");
            firstnum = secondnum;
            secondnum = thirdnum;
        }

    }
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num= obj.nextInt();
        fact(num);
    }
}
