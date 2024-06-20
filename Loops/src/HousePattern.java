import java.util.Scanner;

public class HousePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String resultString = "";
        int len = Math.round((float) n / 2);
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len - i; j++) {
                if (n < 5) {
                    resultString += "  ";
                } else {
                    resultString += " ";
                }
            }
            for (int k = 1; k <= i; k++) {
                if (n < 5) {
                    resultString += "* ";
                } else {
                    resultString += "*";
                }
                if (n % 2 == 0 && k == i && n < 5) {
                    resultString += "* ";
                } else if (n % 2 == 0 && k == i && n > 5) {
                    resultString += "*";
                }
            }
            for (int l = 1; l <= i - 1; l++) {
                if (n < 5) {
                    resultString += "* ";
                } else {
                    resultString += "*";
                }
            }

            System.out.println(resultString);
            resultString = "";
        }
        for (int o = 0; o <= 1; o++) {
            resultString += "*";
            int loopLen = 0;
            if (n == 3) {
                loopLen = n;
            } else if (n < 5) {
                loopLen = n + 1;
            } else {
                loopLen = n - 2;
            }
            for (int m = 1; m <= loopLen; m++) {
                resultString += " ";
            }
            resultString += "*\n";
        }

        System.out.println(resultString);

    }
}
