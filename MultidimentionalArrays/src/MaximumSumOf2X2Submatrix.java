import java.util.Scanner;

public class MaximumSumOf2X2Submatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dimensions = Utils.getLineToIntArray(sc);
        int[][] matrix = Utils.createIntMatrix(dimensions[0], dimensions[1],sc);
        int[][] subMatix = new int[2][2];
        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row < (dimensions[0] - 1); row++) {
            for (int col = 0; col < (dimensions[1] - 1); col++) {
                int sum = matrix[row][col] + matrix[row][col+1] + matrix[row+1][col] + matrix[row+1][col+1];
                if (sum > maxSum) {
                    maxSum = sum;
                    subMatix[0][0] = matrix[row][col];
                    subMatix[0][1] = matrix[row][col+1];
                    subMatix[1][0] = matrix[row+1][col];
                    subMatix[1][1] = matrix[row+1][col+1];
                }
            }

        }
            System.out.println(maxSum);
            Utils.printIntMatrix(subMatix);
    }
}

