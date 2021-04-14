package HomeWork;

public class MultipilicationTable {
    public static void main(String[] args) {

        int[][] Multipilication = new int[10][10];

        for (int line = 1; line <= Multipilication.length; line++) {
            for (int column = 1; column <= Multipilication[line - 1].length; column++) {

                Multipilication[line - 1][column - 1] = line * column;

               System.out.println(Multipilication[line - 1][column - 1]);
            }
        }

    }


}