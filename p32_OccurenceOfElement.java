import java.util.Scanner;

public class p32_OccurenceOfElement
{
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int[] numArray=javaUtility.inputArray();
        System.out.print("Enter the Element of which you find the occurence:");
        int element= obj.nextInt();
        int elecount=numofOccurence(numArray,element);
        System.out.println("Occurence of "+element+" in an array :"+elecount+" times");

    }
    public static int numofOccurence(int[] arr,int e){
        int count=0;
        int i=0;
        while(i<arr.length){
            if(e==arr[i])
                count++;
            i++;
        }
        return count;
    }
}
