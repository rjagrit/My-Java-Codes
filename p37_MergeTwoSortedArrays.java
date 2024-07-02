public class p37_MergeTwoSortedArrays
{
    public static void main(String[] args) {
        int[] arr1= javaUtility.inputArray();
        int[] arr2= javaUtility.inputArray();
        int[] mergedArray= mergeArray(arr1,arr2);
        System.out.println("Merged Array");
        javaUtility.displayArray(mergedArray);

    }

    public static int[] mergeArray(int[] arr1,int[] arr2){
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];
        int i=0,j=0,k=0;
        while(i<arr1.length || j<arr2.length){
            if(j==arr2.length ||
                    (i<arr1.length && arr1[i]<arr2[j])){ // j==arr2.length means ki 2nd vala array khatam ho gya h
                newArr[k]=arr1[i];
                i++;k++;
            }
            else{
                newArr[k]=arr2[j];
                j++;k++;
            }
        }
        return newArr;
    }
}
