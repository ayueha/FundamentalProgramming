package Practice6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Exercises4 {
    public static void main (String[] args){
        /*Integer i =0;
        Integer maxi;
        System.out.println("Plase enter array number");
        maxi=TextIO.getInt();
        insertName(i,maxi);*/
        printNames();



    }

    private static void printNames(){
        ArrayList<String> names = new ArrayList<>();
        while(true){
            System.out.println("Enter a name");
            String input =TextIO.getlnString();
            if (input.equals("")){
                    break;
            }else {
                names.add(input);
            }
        }

        for (String name:names){

        }

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
