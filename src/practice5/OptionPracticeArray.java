package practice5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OptionPracticeArray {

    public static void main(String[] args){
        arraysample();
        System.out.println(Listdemo());

    }

    public static void arraysample(){
        String[] names = new String[3];
        for(int i=0;i<names.length;i++){
            System.out.println("Please Enter your name");
            names[i]=TextIO.getln();
        }

        Arrays.sort(names);
        for(String name:names){
            System.out.println(name);
        }

    }

    private static void arrayListdemo1() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(10);
        numbers.add(1);

        numbers.remove(1);


        for(int i=0; i<numbers.size();i++){
            if (numbers.get(i)==10){
                numbers.set(i,11);
            }
        }
        Collections.sort(numbers);
        System.out.println(numbers);
    }


    public static ArrayList<String> Listdemo() {
        ArrayList <String> names = new ArrayList<String>();
        for (int i=0; i<3;i++){
            System.out.println("Enter a name");
            names.add(TextIO.getln());
        }
        Collections.sort(names);

        return names;

    }
}

