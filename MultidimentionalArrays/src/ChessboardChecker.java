import java.util.Scanner;

public class ChessboardChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dimensions = Utils.getLineToIntArray(sc);
        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] chessboard = Utils.createIntMatrix(rows, cols, sc);
        String result = "No";
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                int currentValue = chessboard[i][j];
                if (currentValue == 1) {
                    if (j != 0) {
                        if (chessboard[i][j + 1] == 1
                                || chessboard[i + 1][j] == 1
                                || chessboard[i + 1][j - 1] == 1
                                || chessboard[i + 1][j + 1] == 1) {
                            result = "Yes";
                        }
                    } else {
                        if (chessboard[i][j + 1] == 1
                                || chessboard[i + 1][j] == 1
                                || chessboard[i + 1][j + 1] == 1) {
                            result = "Yes";
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
