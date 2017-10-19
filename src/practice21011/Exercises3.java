package practice21011;

public class Exercises3 {
    public static void main(String[] args){

    System.out.println("Plese enter number of people of group");
    int numpeople =TextIO.getInt();
    System.out.println("Plase enter number of group");
    int numgroup = TextIO.getInt();
    int leftpeople;

    leftpeople = numpeople%numgroup;
    System.out.println("Nmber of people who do not join in a group is  " + leftpeople);
    }


}

