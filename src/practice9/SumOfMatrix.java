package practice9;

public class SumOfMatrix {



    public static void main(String[] args) {
        int [] row1 = {4,6,1,9};
        int [] row2 = {-5,-10,-12};
        int [] row3 = {0,2,1};

        int[][] matrix =  {
          row1,
          row2,
          row3,

        } ;

        /*System.out.println(maxOfRaw(row1));
        System.out.println(maxOfRaw(row2));
        System.out.println(maxOfRaw(row3));
        */
        System.out.println(maxOfSomeRaw(matrix));

    }
    private static int maxOfSomeRaw(int [][] matrix){
        //Call out max of raw



        int max = Integer.MIN_VALUE;
        int sum=0;
        for(int i =0; i<matrix.length; i++){
            sum += maxOfRaw(matrix[i]);

        }
        return -1;
    };

    private static int maxOfRaw(int[] array){
        int max =Integer.MIN_VALUE;

        for (int i =0 ; i<array.length; i++){
            if (max<array[i]){
                max=array[i];
            }
        }
        return max;
    };





}
