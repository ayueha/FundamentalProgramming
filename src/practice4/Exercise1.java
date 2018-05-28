package practice4;

public class Exercise1 {
    public static void main(String args[]){
        Integer i;
        Integer j;
        Integer k=0;

        for (i=0; i<=10; i++){
            System.out.println(i+"");
        }

        for (i=0; i<=10; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }

        for (i=0; i<=30; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        Integer blocksize =6;
        for (j=0;j<=blocksize; j++){
            for (i=0; i<=blocksize; i++){
                if (i==k){
                    if (i==blocksize){
                        System.out.println(" 1 ");
                    }else{
                        System.out.print(" 1 ");
                    }
                }else{
                    if (i==blocksize){
                        System.out.println(" 0 ");
                    }else {
                        System.out.print(" 0 ");
                    }
                }
            }
            k++;
        }

        Integer jsize =6;
        Integer ksize =6;
        Integer l;
        Integer m;
            System.out.println("-----------------------");
                l =0;
                m =6;
                for (j = 0; j <= jsize; j++) {
                        System.out.print("|");
                        for (k = 0; k <= ksize; k++) {
                            if (k == l) {
                                System.out.print(" X ");
                            } else if (k == m && l!=k) {
                                System.out.print(" X ");
                            } else {
                                System.out.print(" 0 ");
                            }
                        }
                        l++;
                        m--;
                    System.out.println("|");
                }
        System.out.println("-----------------------");
    }

}
