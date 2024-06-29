import java.util.Scanner;

public class p31_sumAverageOfArray
{
    public static void main(String[] args) {
        int[] numArray=javaUtility.inputArray(); //using a class
        double sum=sum(numArray);
        double avg=avg(numArray);
        System.out.print("Sum of Elements of an array is "+ sum);
        System.out.print("\nAverage of ELements of an array is "+ avg);
    }
    public static double sum(int[] numAry){
        double sum=0;
        int i=0;
        while(i<numAry.length){
            sum+=numAry[i];
            i++;
        }
        return sum;
    }

    public static double avg(int[] nmAry){
        double sum=sum(nmAry);
        return sum/nmAry.length;
    }
}
