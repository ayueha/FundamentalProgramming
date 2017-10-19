package practice3;


public class Excercises3 {
    public static void main(String[] args) {
        System.out.println("How old are you? (First persion)");
        Integer formerage = TextIO.getInt();
        System.out.println("How old are you? (Second persion)");
        Integer latterage = TextIO.getInt();
        Integer gapage = Math.abs(formerage-latterage);

        if (gapage<5){
            System.out.println("Gap is under 5");
        }else if (gapage >=5  && gapage < 10){
            System.out.println("Gap is 5 over and under 10");
        }else{
            System.out.println("Gap is over 10 ");
        }


    }
}
