import java.util.Scanner;

public class RowSumAndColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dimensions = Utils.getLineToIntArray(sc);
        int[][] matrix = Utils.createIntMatrix(dimensions[0], dimensions[1], sc);
        String rowsResult = Utils.stringSumOfRows(matrix);
        System.out.println(STR."Row Sums: \{rowsResult}");
        String colsResult = Utils.stringSumOfCols(matrix);
        System.out.println(STR."Column Sums: \{colsResult}");
    }
}
