import java.util.Scanner;

public class TreePattern {
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
        for (int l = 1; l <= n - 1; l++) {
            resultString += " ";
        }
        resultString += "*";
        System.out.println(resultString);

    }
}
