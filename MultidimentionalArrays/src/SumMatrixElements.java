import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dimensions = Utils.getLineToIntArray(sc);
        int sumOfElements = 0;
        for (int row = 0; row < dimensions[0]; row++) {
            int[] currentRow = Utils.getLineToIntArray(sc);
            for (int col = 0; col < dimensions[1]; col++) {
                sumOfElements += currentRow[col];
            }
        }

        System.out.println(dimensions[0]);
        System.out.println(dimensions[1]);
        System.out.println(sumOfElements);
    }
}
