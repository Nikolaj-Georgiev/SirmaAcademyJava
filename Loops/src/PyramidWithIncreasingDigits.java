import java.util.Scanner;

public class PyramidWithIncreasingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String resultString = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                resultString += " ";
            }
            for (int k = 1; k <= i; k++) {
                resultString += (k + i - 1);
            }
            for (int l = i - 1; l >= 1; l--) {
                resultString += (l + i - 1);
            }

            System.out.println(resultString);
            resultString = "";
        }
    }

}
// от 6 нагоре не е красиво заради това, че числото вече заема 2 позиции и ще стане доста сложно да го наглася и да бъде крависво :)