import java.util.Scanner;

public class ArrowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String resultString = "";
        int len = n - 1;

        for (int i = 1; i <= len; i++) {
            for (int k = 1; k <= len - i; k++) {
                resultString += " ";
            }
            for (int j = 1; j <= i; j++) {
                resultString += "*" + " ";
            }
            System.out.println(resultString);
            resultString = "";
        }
        for (int o = 0; o < len; o++) {
            int loopLen = n - 2;
            for (int l = 1; l <= Math.round((float) loopLen / 2); l++) {
                resultString += " ";
            }
            int finalLoopLen = len;
            if (n % 2 != 0) {
                finalLoopLen--;
            }
            for (int m = 1; m <= finalLoopLen; m++) {
                resultString += "*";
            }
            resultString += "\n";
        }

        System.out.println(resultString);

    }

}
