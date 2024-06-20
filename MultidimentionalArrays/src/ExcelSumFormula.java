import java.util.Arrays;
import java.util.Scanner;

public class ExcelSumFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dimensions = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] matrix = Utils.createIntMatrix(rows, cols, sc);
        String[] rangeInput = sc.nextLine().split(":");
        int excelSum = getExcelSum(rangeInput, matrix);

        System.out.println(excelSum);

    }

    private static int getExcelSum(String[] rangeInput, int[][] matrix) {
        int excelSum = 0;

        int startRowPosition = Integer.parseInt(rangeInput[0].split("")[1]) - 1;
        int endRowPosition = Integer.parseInt(rangeInput[1].split("")[1]) - 1;
        char startChar = rangeInput[0].split("")[0].charAt(0);
        int startColPosition = startChar - 'A';
        int endColPosition = (rangeInput[1].split("")[0].charAt(0)) - 'A';

        for (int row = startRowPosition; row <= endRowPosition; row++) {
            for (int col = startColPosition; col <= endColPosition; col++) {
                excelSum += matrix[row][col];
            }
        }
        return excelSum;
    }
}
