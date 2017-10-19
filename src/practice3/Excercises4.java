package practice3;


public class Excercises4 {
    public static void main(String[] args) {
        System.out.println("Enter the password");
        String paswd = TextIO.getWord();

        if(paswd=="touken"){
            System.out.println("Succeed!");
        }else{
            System.out.println("You are not authorized");
        }

    }
}
