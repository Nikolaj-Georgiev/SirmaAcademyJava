import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstMatrixDimensions = Arrays.stream(sc.nextLine().split(" ")).toArray(String[]::new);
        int rows = Integer.parseInt(firstMatrixDimensions[0]);
        int cols = Integer.parseInt(firstMatrixDimensions[1]);
        int[][] firstMatrix = Utils.createIntMatrix(rows,cols,sc);
        String[] secondMatrixDimentions = Arrays.stream(sc.nextLine().split(" ")).toArray(String[]::new);
        int rows2 = Integer.parseInt(secondMatrixDimentions[0]);
        int cols2 = Integer.parseInt(secondMatrixDimentions[1]);

        if (rows!= rows2 || cols!= cols2) {
            System.out.println("not equal");
            return;
        }
        int[][] secondMatrix = Utils.createIntMatrix(rows2,cols2,sc);

        String result = Arrays.deepEquals(firstMatrix, secondMatrix) ? "equal" : "not equal";

        System.out.println(result);

    }

//    public static int[][] createMatrix(int rows, int cols, Scanner sc) {
//        int[][] matrix = new int[rows][cols];
//        for (int row = 0; row < rows; row++) {
//            String[] matrixRow = sc.nextLine().split(" ");
//            for (int col = 0; col < cols; col++) {
//                matrix[row][col] = Integer.parseInt(matrixRow[col]);
//            }
//        }
//
//        return matrix;
//    }
}
