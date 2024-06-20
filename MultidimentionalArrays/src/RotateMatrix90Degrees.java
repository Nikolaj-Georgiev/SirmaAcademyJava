import java.util.Scanner;

public class RotateMatrix90Degrees {
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

        int[][] rotatedMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                rotatedMatrix[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }

        Utils.printIntMatrix(rotatedMatrix);
    }
}
