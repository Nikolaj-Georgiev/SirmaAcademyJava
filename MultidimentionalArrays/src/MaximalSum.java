import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dimensions = Utils.getLineToIntArray(sc);
        int n = dimensions[0];
        int m = dimensions[1];
        if (n < 3 || m < 3) {
            return;
        }
        int[][] rectMatrix = Utils.createIntMatrix(n, m, sc);
        int[][] subMatix = new int[3][3];
        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row < n - 2; row++) {
            for (int col = 0; col < m - 2; col++) {
                int sum = rectMatrix[row][col] + rectMatrix[row][col + 1] + rectMatrix[row][col + 2]
                        + rectMatrix[row + 1][col] + rectMatrix[row + 1][col + 1] + rectMatrix[row + 1][col + 2]
                        + rectMatrix[row + 2][col] + rectMatrix[row + 2][col + 1] + rectMatrix[row + 2][col + 2];
                if (sum > maxSum) {
                    maxSum = sum;
                    subMatix[0][0] = rectMatrix[row][col];
                    subMatix[0][1] = rectMatrix[row][col + 1];
                    subMatix[0][2] = rectMatrix[row][col + 2];
                    subMatix[1][0] = rectMatrix[row + 1][col];
                    subMatix[1][1] = rectMatrix[row + 1][col + 1];
                    subMatix[1][2] = rectMatrix[row + 1][col + 2];
                    subMatix[2][0] = rectMatrix[row + 2][col];
                    subMatix[2][1] = rectMatrix[row + 2][col + 1];
                    subMatix[2][2] = rectMatrix[row + 2][col + 2];
                }
            }

        }

        System.out.println(STR."Sum = \{maxSum}");
        Utils.printIntMatrix(subMatix);
    }
}
