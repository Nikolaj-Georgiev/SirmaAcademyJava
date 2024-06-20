import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] matrixDimensions = Utils.getLineToIntArray(sc);
        int[][] matrix = Utils.createIntMatrix(matrixDimensions[0], matrixDimensions[1], sc);

        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < matrix.length; row++) {
            String[] matrixRow = Arrays.stream(sc.nextLine().split(" ")).toArray(String[]::new);
            for (int col = 0; col < matrix[row].length; col++) {
                int sum = matrix[row][col] + Integer.parseInt(matrixRow[col]);
                sb.append(sum).append(" ");
                matrix[row][col] = sum;
            }
            if (row != matrix.length - 1) {
                sb.append("\n");
            }
        }

        System.out.println(sb);

    }

//    public static int[][] createMatrix(int rows, int cols, Scanner sc) {
//        int[][] matrix = new int[rows][cols];
//        for (int row = 0; row < rows; row++) {
//            String[] matrixRow = Arrays.stream(sc.nextLine().split(" ")).toArray(String[]::new);
//            for (int col = 0; col < cols; col++) {
//                matrix[row][col] = Integer.parseInt(matrixRow[col]);
//            }
//        }
//
//        return matrix;
//    }


}
