import java.util.Scanner;

public class p38_Search2DArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[][] ary2D = javaUtility.input2DArray();
        System.out.print("Now enter the number you want to find:");
        int num = obj.nextInt();
        boolean res= search(ary2D,num);
        if(res){
            System.out.println("Yor number was founded");
        }
        else{
            System.out.println("Number was not founded");
        }
    }

    public static boolean search(int[][] ary,int searchnum){
        int i=0;
        while(i<ary.length){
            int j=0;
            while(j<ary[i].length){ // 1st row complete ho gyi h toh next par jaega
                if(ary[i][j] == searchnum)
                    return true;
                j++;
            }
            i++;
        }
        return false;
    }
}
