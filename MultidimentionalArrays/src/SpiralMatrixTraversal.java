import java.util.Scanner;

public class SpiralMatrixTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dimensions = Utils.getLineToIntArray(sc);
        int rows = dimensions[0];
        int cols = dimensions[1];
        if (rows != cols) {
            return;
        }
        int[][] matrix = Utils.createIntMatrix(rows, cols, sc);

        int top = 0;
        int right = 0;
        int bottom = cols - 1;
        int left = rows - 1;
        StringBuilder result = new StringBuilder();
        while (rows != 0 || cols != 0) {
            for (int i = top; i < cols - 1; i++) {
//                System.out.println(matrix[top][i]);
                result.append(matrix[top][i]).append(" ");
            }
            for (int i = right; i < rows; i++) {
//                System.out.println(matrix[i][cols - 1]);
                result.append(matrix[i][cols - 1]).append(" ");
            }
            for (int i = bottom - 1; i >= right; i--) {
//                System.out.println(matrix[rows - 1][i]);
                result.append(matrix[rows - 1][i]).append(" ");
            }
            for (int i = left - 1; i > top; i--) {
//                System.out.println(matrix[i][right]);
                result.append(matrix[i][right]).append(" ");
            }

            top++;
            right++;
            bottom--;
            left--;
            rows--;
            cols--;
        }

        System.out.println(result);
    }
}
