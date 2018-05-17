package practice8;

public class WordToSarethethByDash {

    public static void main(String[] args) {

        System.out.println("Please enter the sentences");

        String input = TextIO.getlnString();

        String[] inputArray =input.split(" ");
        for (int i =0; i<inputArray.length;i++){
            if ( i<inputArray.length-1){
                System.out.print(inputArray[i].toUpperCase()+"-");
            }else{
                System.out.print(inputArray[i].toUpperCase());
            }

        }
    }

}
