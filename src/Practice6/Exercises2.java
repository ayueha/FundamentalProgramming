package Practice6;


import java.util.Arrays;
import java.util.Comparator;

public class Exercises2 {
    public static void main (String[] args){
        Integer i =0;
        Integer maxi;
        System.out.println("Plase enter array number");
        maxi=TextIO.getInt();
        insertName(i,maxi);

    }

    private static void insertName(Integer i, Integer maxi){
        Integer [] numbers = new Integer[maxi];


        for (i=0; i<numbers.length; i++){
            System.out.println("Plase enter a number");
            numbers[i]=TextIO.getlnInt();
        }

        Arrays.sort(numbers,Comparator.reverseOrder());
        System.out.println(Arrays.toString(numbers));


    }


}
