import java.util.Scanner;

public class RhombusFromAsterisks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String resultString = "";

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                resultString += " ";
            }
            for (int j = 1; j <= i; j++) {
                resultString += "*" + " ";
            }
            System.out.println(resultString);
            resultString = "";
        }
        for (int i = n - 1; i > 0; i--) {
            for (int l = 1; l <= n - i; l++) {
                resultString += " ";
            }
            for (int j = i; j > 0; j--) {
                resultString += "*" + " ";
            }
            System.out.println(resultString);
            resultString = "";
        }
    }
}
