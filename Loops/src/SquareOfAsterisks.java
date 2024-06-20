import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String resultString = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                resultString += "*" + " ";
            }
            System.out.println(resultString.trim());
            resultString = "";
        }
    }
}
