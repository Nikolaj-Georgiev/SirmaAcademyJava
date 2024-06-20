import java.util.Arrays;
import java.util.Scanner;


public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mRows = Integer.parseInt(sc.nextLine());
        int nCols = Integer.parseInt(sc.nextLine());
        String[][] matrix = new String[mRows][nCols];
        for (int i = 0; i < mRows; i++) {
           String[] line = sc.nextLine().split(" ");
           for (int j = 0; j < nCols; j++) {
               matrix[i][j] = line[j];
           }
        }
        String[][] intersectionMatrix = new String[mRows][nCols];
        for (int i = 0; i < mRows; i++) {
            String[] line = sc.nextLine().split(" ");
            for (int j = 0; j < nCols; j++) {
                if (line[j].equals(matrix[i][j])) {
                    intersectionMatrix[i][j] = line[j];
                } else {
                    intersectionMatrix[i][j] = "*";
                }
            }
        }

        Utils.printStringMatrix(intersectionMatrix);


    }


}
