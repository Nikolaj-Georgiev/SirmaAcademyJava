import java.util.Scanner;

public class TreePatternWithoutSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String resultString = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                resultString += " ";
            }
            for (int k = 1; k <= i; k++) {
                resultString += "*";
            }
            for (int l = 1; l <= i - 1; l++) {
                resultString += "*";
            }

            System.out.println(resultString);
            resultString = "";
        }

        for (int m = 1; m <= n - 1; m++) {
            resultString += " ";
        }
        resultString += "*";
        System.out.println(resultString);
    }

}

