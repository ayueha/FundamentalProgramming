package practice5;

import practice21011.TextIO;

public class Exercise2 {


    //private --- use only this class
    //protected--access only the class

    public static void main(String[] args) {
        /*int tablesize = 19;
        drawTable(tablesize);
        System.out.print(xCharacters('A' ,19));*/

        System.out.println(getNumber(2, 10));

    }

    public static String xCharacters(char chac, int i){
        String result ="";
        for (int start =0; start<i; start++){
            result += chac;
        }
        return result;
    }


    public static int getNumber(int min, int max){
        String question ="Please enter a number";
        int number = getInputNumber(question);
        while(number<min && number >max) {
                System.out.println("Please reenter other number");
                number = getInputNumber(question);
            }
            return number;
    }

    private static int getInputNumber(String question) {
        System.out.println(question);
        return practice5.TextIO.getInt();
    }



}
