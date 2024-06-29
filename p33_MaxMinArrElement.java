public class p33_MaxMinArrElement
{
    public static void main(String[] args) {
        int[] arrNum= javaUtility.inputArray();
        int min= minnum(arrNum);
        int max= maxnum(arrNum);
        System.out.println("Max of the Array is: "+ max);
        System.out.println("Min of the Array is: "+ min);

    }
    public static int minnum(int[] arr1){
        int min= Integer.MAX_VALUE;
        int i=0;
        while(i<arr1.length){
            if(min>arr1[i])
               min=arr1[i];
            i++;
        }
        return min;
    }

    public static int maxnum(int[] arr2){
        if(arr2.length==0)
            return Integer.MIN_VALUE; // return zabse choti value

        int max=arr2[0];
        int i=1;
        while (i<arr2.length){
            if(max<arr2[i])
                max=arr2[i];
            i++;
        }
        return max;
    }
}
