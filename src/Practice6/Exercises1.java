package Practice6;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Exercises1 {
    public static void main (String[] args){
        Integer i =0;
        Integer maxi;
        System.out.println("Plase enter array number");
        maxi=TextIO.getInt();
        insertName(i,maxi);

    }

    private static void insertName(Integer i, Integer maxi){
        String [] names = new String[maxi];
        for (i=0; i<names.length; i++){
            System.out.println("Plase enter some name");
            String username = TextIO.getlnString();
            names[i]=username;
        }

        System.out.println(Arrays.toString(names));
        System.out.println(names [new Random().nextInt(names.length)]);



    }


}
