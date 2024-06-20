import java.util.Scanner;

public class MatrixBoundarySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dimensions = Utils.getLineToIntArray(sc);
        if (dimensions[0] != dimensions[1]) {
            return;
        }
        int[][] matrix = Utils.createIntMatrix(dimensions[0], dimensions[1], sc);
        if (matrix.length != matrix[0].length) {
            return;
        }
        int sum = 0;
        for (int i = 0; i < dimensions[0]; i++) {
            for (int j = 0; j < dimensions[1]; j++) {
                if (i != 0 && i != dimensions[0] - 1) {
                    if (j == 0 || j == dimensions[1] - 1) {
                        sum += matrix[i][j];
                    }
                } else {
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println(sum);

    }
}
