package practice8;
import java.util.ArrayList;
public class WordToSaretheth {

    public static void main(String[] args) {

        System.out.println("plase enter the sentences");

        String input = TextIO.getlnString();

        String[] inputArray =input.split(" ");
        for (String words :inputArray){
            System.out.print("(" + words +")");
        }


    }

}
