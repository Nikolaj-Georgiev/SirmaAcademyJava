import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int squareSize = Integer.parseInt(sc.nextLine());
        int[][] matrix = Utils.createIntMatrix(squareSize,squareSize,sc);
        StringBuilder firstDiagonal = new StringBuilder();
        StringBuilder secondDiagonal = new StringBuilder();

        for (int i = 0; i < squareSize; i++) {
            firstDiagonal.append(matrix[i][i]).append(" ");
            secondDiagonal.append(matrix[squareSize - i - 1][i]).append(" ");
        }

        System.out.println(firstDiagonal);
        System.out.println(secondDiagonal);

    }
}
