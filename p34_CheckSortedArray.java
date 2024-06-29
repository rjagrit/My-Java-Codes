import java.util.Scanner;

public class p34_CheckSortedArray
{
    public static void main(String[] args) {
        int[] numArr= javaUtility.inputArray();
        boolean isInc= isIncreasingOrder(numArr);
        boolean isDec= isDecreasingOrder(numArr);
        if(isInc || isDec){
            System.out.println("Your Array is Sorted");
        }
        else{
            System.out.println("Your Array is not sorted");
        }

    }
    public static boolean isIncreasingOrder(int[] ar){
        int i=1;
        while(i<ar.length){
            if(ar[i]<ar[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasingOrder(int[] ar){
        int i=1;
        while(i<ar.length){
            if(ar[i]>ar[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

}
