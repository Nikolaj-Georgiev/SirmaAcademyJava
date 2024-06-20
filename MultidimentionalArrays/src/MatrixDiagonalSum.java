import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dim = Utils.getLineToIntArray(sc);
        if(dim[0] != dim[1]){
            return;
        }
        int[][] matrix = Utils.createIntMatrix(dim[0], dim[1], sc);
        int sum = Utils.sumDiagonal(matrix);
        System.out.println(sum);

    }
}
