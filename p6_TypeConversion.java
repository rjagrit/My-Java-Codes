public class p6_TypeConversion
{
    public static void main(String[] args) {
        float myFloat=5;
        System.out.println(myFloat); //5.0

        //Two types of type casting (implicit{automatic} and explicit)

        System.out.println(myFloat);//implicit
       /* float myF=5d;
       5d means 5 double can't store in the small container
         we need to cast it forcefully {explicit}
        */

        float myExplicitCon= (float)5d;
        int h=(int)myExplicitCon;
        System.out.println(h);
    }
}
