package practice3;

public class Excercises1 {
    public static void main(String[] args) {
        System.out.println("Please Enter some integer number");
        Integer inputnumber = TextIO.getInt();
        Integer evenodd = inputnumber%2;

        if (evenodd >0) {
            System.out.println("number is odd");
        }else if (evenodd == 0){
            System.out.println("number is even");
        }

    }
}
