package practice5;

public class Exercise3 {

    public static void main(String[] args) {


        int tableSize = practice5.Exercise2.getNumber(7, 19);

        Integer l;
        Integer m;

        l = 0;
        m = tableSize;

        createline (tableSize);
        createTable(tableSize, l, m);
        createline (tableSize);

    }

    public static void createline (int tableSize){
        Integer i = 0;
        for (i =0;i<=tableSize;i++){
            if(i<tableSize) {
                System.out.print(" - ");
            }else if (i==tableSize){
                System.out.println(" - ");
            }
        }

    }

    public static void createTable(int tableSize, Integer l, Integer m) {
        Integer i;
        Integer j;
        tableSize=tableSize-1;
        m=m-1;

        for (i = 0; i <= tableSize; i++) {
            System.out.print("|");
            for (j = 0; j <= tableSize; j++) {
                if (j == l) {
                    System.out.print(" X ");
                } else if (j == m && l != j) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" 0 ");
                }
            }
            l++;
            m--;
            System.out.println("|");
        }
    }
}
