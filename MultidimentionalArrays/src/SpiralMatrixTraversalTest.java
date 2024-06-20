import java.util.Scanner;

public class SpiralMatrixTraversalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dimensions = Utils.getLineToIntArray(sc);
        int rows = dimensions[0];
        int cols = dimensions[1];
        if (rows != cols) {
            return;
        }
        int[][] matrix = Utils.createIntMatrix(rows, cols, sc);

        int start = 0;
        int end = rows;
        StringBuilder result = new StringBuilder();
        while (end != 0) {
            StringBuilder topStr = new StringBuilder();
            StringBuilder rightStr = new StringBuilder();
            StringBuilder bottomStr = new StringBuilder();
            StringBuilder leftStr = new StringBuilder();
            for (int i = start; i < end - 1; i++) {
                topStr.append(matrix[start][i]).append(" ");
                rightStr.append(matrix[i][end - 1]).append(" ");
                bottomStr.append(matrix[end - 1][end - 1 + start - i]).append(" ");
                leftStr.append(matrix[end - 1 + start - i][start]).append(" ");
            }

            start++;
            end--;
            result.append(topStr).append(rightStr).append(bottomStr).append(leftStr);
        }

        if (rows % 2 != 0) {
            result.append(matrix[rows / 2][rows / 2]);
        }
        System.out.println(result);
    }
}
