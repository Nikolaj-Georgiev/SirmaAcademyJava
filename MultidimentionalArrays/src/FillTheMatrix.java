import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int squareSize = Integer.parseInt(input[0]);
        String pattern = input[1];
        int initialValue = 1;
        int[][] matrix = new int[squareSize][squareSize];

        if (pattern.equals("A")) {
            for (int i = 0; i < squareSize; i++) {
                for (int j = 0; j < squareSize; j++) {
                    matrix[j][i] = initialValue;
                    initialValue++;
                }
            }

        } else {
            for (int i = 0; i < squareSize; i++) {
                for (int j = 0; j < squareSize; j++) {
                    if (i % 2 == 0) {
                        matrix[j][i] = initialValue;
                    } else {
                        matrix[squareSize - 1 - j][i] = initialValue;
                    }
                    initialValue++;
                }
            }

        }

        Utils.printIntMatrix(matrix);
    }
}
