import java.util.Scanner;

public class p24_LCM
{
    public static int lcm(int f, int s)
    {
        int i=1;
        while(i<=s){
            int factor= f * i;// number multiplied by 1 to 10
            if(f % s ==0)// if result of mulitpliction equals to sencond number it means second number exist in the multiple queue of first on and second one is the answer
                return factor;
            i++;
        }
        return 0; //unreachable
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        int n1= obj.nextInt();
        System.out.print("Enter 2nd Number:");
        int n2= obj.nextInt();
        int res= lcm(n1,n2);
        System.out.println("LCM of "+n1+" and "+n2+" is: "+res);

    }
}
