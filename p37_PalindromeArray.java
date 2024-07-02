public class p37_PalindromeArray
{
    public static void main(String[] args) {
        int[] ary = javaUtility.inputArray();
        boolean isPalindromeArray = isPalindrome(ary);
        if(isPalindromeArray){
            System.out.println("Your Array is Palindrome");
        }
        else{
            System.out.println("Your Array is not Palindrome");
        }
    }

    public static boolean isPalindrome(int[] numArr){
        int i= 0;
        while(i<numArr.length / 2){
         if(numArr[i] != numArr[numArr.length-1-i]){
             return false;
            }
            i++;
        }
        return true;
    }
}
