package practice7;
import jdk.internal.util.xml.impl.Input;

import java.util.*;


public class Execises1 {
    public static void main(String[] args){

        ArrayList<Human> humansList = new ArrayList<>();
        while(true) {

            System.out.println("Please tell me your name ,press Enter to Exit");
            String personalName = TextIO.getlnString();

            if (personalName.equals("")) {
                break;
            } else {
                System.out.println("Please tell me your age");
                int personalAge = TextIO.getlnInt();
                humansList.add(new Human(personalName, personalAge));
            }

        }
        //System.out.println(humansList);
        for(Human person:humansList){
            person.greet();
        }

    }






}
