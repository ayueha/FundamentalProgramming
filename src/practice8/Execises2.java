package practice8;

import java.util.ArrayList;
import java.util.Comparator;


public class Execises2 {
    public static void main(String[] args){

        ArrayList<Athlete> athletes = new ArrayList<>();
        while(true) {

            System.out.println("Please tell me your name and rerult ,press Enter to Exit");
            String input = TextIO.getlnString();

            if (input.equals("")) {
                break;
            } else {
                String[] inputArray =input.split(" ");
               // humansList.add(new Athlete(inputArray[0]),Double.parseDouble())
                //athletes.add(new Athlete(inputArray[0],Double.parseDouble()));
            }

        }

        athletes.sort(new Comparator<Athlete>() {
            @Override
            public int compare(Athlete o1, Athlete o2) {
                return o2.getResult().compareTo(o1.getResult());
            }
        });

        //System.out.println(humansList);
        for(Athlete person:athletes){

        }

    }






}
