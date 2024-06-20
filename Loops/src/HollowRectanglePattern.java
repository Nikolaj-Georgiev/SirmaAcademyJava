import java.util.Scanner;

public class HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = Math.abs(Integer.parseInt(sc.nextLine()));
        int cols = Math.abs(Integer.parseInt(sc.nextLine()));

        String result = "";

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (col != cols - 1 && col != 0 && row != rows - 1 && row != 0) {
                    result += " ";
                } else {
                    result += "*";
                }

                if (col == cols - 1) {
                    result += "\n";
                }
            }
        }

        System.out.println(result);
    }
}
