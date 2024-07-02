public class p39_Sum_AverageOf2DArray
{
    public static void main(String[] args) {
        int[][] ary = javaUtility.input2DArray();
        double sumofArray = sum2DArrayElements(ary);
        double avgofArray = avg2DArrayElements(ary);
        System.out.println("Sum of 2D array is :"+sumofArray);
        System.out.println("Average of 2D array is:"+avgofArray);
    }
    public static double sum2DArrayElements(int[][] ary){
        long sum=0;
        int i=0;
        while (i<ary.length){
            int j=0;
            while(j<ary[i].length){
                sum+=ary[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double avg2DArrayElements(int[][] ary){
        if(ary.length==0)
            return 0;
        int rows = ary.length;
        int cols= ary[0].length;
        double size = rows * cols;
        return sum2DArrayElements(ary)/size;
    }
}
