package practice7;

import java.util.ArrayList;


public class Execises2 {
    public static void main(String[] args){

        ArrayList<Human> humansList = new ArrayList<>();
        while(true) {

            System.out.println("Please tell me your name and rerult ,press Enter to Exit");
            String input = TextIO.getlnString();

            if (input.equals("")) {
                break;
            } else {
                String[] inputArray =input.split(" ");
               // humansList.add(new Athlete(inputArray[0]),Double.parseDouble())
            }

        }
        //System.out.println(humansList);
        for(Human person:humansList){
            person.greet();
        }

    }






}
