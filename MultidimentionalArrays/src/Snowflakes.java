import java.util.Arrays;
import java.util.Scanner;

public class Snowflakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dimensions = Utils.getLineToIntArray(sc);
        int rows = dimensions[0];
        int cols = dimensions[1];
        String[][] grid = new String[rows][cols];
        String separator = "=";
        for (int r = 0; r < rows; r++) {
            String[] matrixRow = Arrays.stream(sc.nextLine().split(" ")).toArray(String[]::new);
            for (int c = 0; c < cols; c++) {
                grid[r][c] = matrixRow[c];
            }
        }

        for (int r = 0; r < rows - 1; r++) {
            boolean isSnowflake = false;
            for (int c = 0; c < cols; c++) {
                String cur = grid[r][c];
                if (cur.equals("*")) {
                    if (grid[r + 1][c].equals("0")) {
                        grid[r + 1][c] = cur;
                        grid[r][c] = "0";
                        isSnowflake = true;
                    }
                }

            }
            if (isSnowflake) {
                Utils.printStringMatrix(grid);
                if (r < (rows - 2)) {
                    System.out.println(separator.repeat(rows));
                }
            }
        }

    }
}
