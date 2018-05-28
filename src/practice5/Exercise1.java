package practice5;
import practice5.TextIO;
public class Exercise1 {



    /*
        Print out the following table with "borders". The height of the table is equal to the width.
        -----------------
        | x 0 0 0 0 0 x |
        | 0 x 0 0 0 x 0 |
        | 0 0 x 0 x 0 0 |
        | 0 0 0 x 0 0 0 |
        | 0 0 x 0 x 0 0 |
        | 0 x 0 0 0 x 0 |
        | x 0 0 0 0 0 x |
        -----------------
     */


            public static void main(String[] args) {

                int tableSize = 9;

                int lineStart = 0;

                makeLine(tableSize, lineStart);

                System.out.println();

                for (int col = 0; col < tableSize; col++) {

                    System.out.print("| ");

                    for (int row = 0; row < tableSize; row++) {

                        // col 7 ; row 0
                        // col 6 ; row 1
                        // col 5 ; row 2

                        if (col == row || col + row == tableSize - 1)
                            System.out.print("x ");
                        else
                            System.out.print(0 + " ");

                    }

                    System.out.print("| ");

                    System.out.println();
                }

                lineStart = 0;

                makeLine(tableSize, lineStart);
            }

    private static void makeLine(int tableSize, int lineStart) {
        while (lineStart <= tableSize + 1) {

            System.out.print("- ");
            lineStart++;
        }
    }

}
