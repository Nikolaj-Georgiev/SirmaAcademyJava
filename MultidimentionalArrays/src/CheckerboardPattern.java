import java.util.Scanner;

public class CheckerboardPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[n][n];
        int squareValue = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = squareValue;
                squareValue = squareValue == 0 ? 1 : 0;
            }
            if (n % 2 == 0) {
                squareValue = squareValue == 0 ? 1 : 0;
            }
        }

        Utils.printIntMatrix(matrix);
    }
}
