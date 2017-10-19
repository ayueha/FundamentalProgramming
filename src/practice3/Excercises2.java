package practice3;

public class Excercises2 {
    public static void main(String[] args) {
        System.out.println("Please Enter averagegrade");
        Double averagegrade = TextIO.getDouble();
        System.out.println("Please Enter diplomagrade");
        Integer gradediploma = TextIO.getInt();

        if (averagegrade >= 4.5 && gradediploma ==5){
            System.out.println("You get Cum Laude!");
        }else{
            System.out.println("Sorry You did not get Cum Laude");
        }


    }
}
