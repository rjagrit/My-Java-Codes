public class p40_SumOfTwoDiagonalElements
{
    public static void main(String[] args) {
        int[][] ary = javaUtility.input2DArray();
        double sum = sumOfDiagonals(ary);
        System.out.println("Sum of Diagonal elements of array: "+sum);
    }

    public static long sumOfDiagonals(int[][] ary){
        long leftSum = leftDiagonal(ary);
        long rightSum = rightDiagonal(ary);
        long sum = leftSum+rightSum;
        if(ary.length%2!=0){
            int index = ary.length/2;
            sum-=ary[index][index];
        }
        return sum;
    }


    public static long leftDiagonal(int[][] ary){
        int sum=0;
        int i=0;
        while(i<ary.length){
            sum+=ary[i][i];
            i++;
        }
//        while(i<ary.length){
//            int j=0;
//            while (j<ary[i].length){
//                if(i==j){
//                   sum+=ary[i][j];
//                }
//                j++;
//            }
//            i++;
//        }
        return sum;
    }

    public static long rightDiagonal(int[][] ary){
        long sum=0;
        int i=0;
        while(i<ary.length){
            int col=ary.length-1-i; // last index
            sum+=ary[i][col];
            i++;
        }
        return sum;
    }
}
