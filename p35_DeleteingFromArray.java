import java.util.Scanner;

public class p35_DeleteingFromArray
{
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int[] numAr= javaUtility.inputArray();
        System.out.println("Now, enter the number you want to delete:");
        int num=obj.nextInt();
        int[] newArr=deleteNum(numAr,num);
        javaUtility.displayArray(newArr);

    }
    public static int[] deleteNum(int[] arr,int numtodel)
    {
    int occ=p32_OccurenceOfElement.numofOccurence(arr,numtodel);
    if(occ==0)
       return arr;
    int newsize=arr.length-occ;
    int[] newarr= new int[newsize];
    int i=0,j=0;
    while(i<arr.length){
       if(arr[i]!=numtodel) {
           newarr[j] = arr[i];
           j++;
       }
        i++;
    }
    return newarr;
    }
}
