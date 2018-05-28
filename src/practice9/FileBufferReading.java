package practice9;
import java.io.*;

public class FileBufferReading {

    public static void main(String[] args)  {
        inputFile("tryout.txt");
    }


    private static void inputFile(String Filepath)  {

        String line;

        try {
            BufferedReader mReader = new BufferedReader(new FileReader(new File(Filepath)));

            while((line =mReader.readLine()) != null){

                System.out.println(line);

            }
        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}
