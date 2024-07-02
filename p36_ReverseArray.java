public class p36_ReverseArray
{
    public static void main(String[] args) {
        int[] numArr = javaUtility.inputArray();
        System.out.println("Rversed Array is");
        reversedArray(numArr);
    }

    public static void reversedArray(int[] a){
        int i=a.length-1;
        while(i>=0){
            System.out.print(a[i]+" ");
            i--;
        }
    }
}