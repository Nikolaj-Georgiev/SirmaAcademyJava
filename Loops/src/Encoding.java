import java.util.Scanner;

public class Encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String digits = sc.nextLine();

        for (int i = digits.length() - 1; i >= 0; i--) {
            String result = "";
            int digit = Integer.parseInt(String.valueOf(digits.charAt(i)));
            int temp = digit;
            if (temp == 0) {
                System.out.println("ZERO");
            } else {
                temp += 33;
                char ch = (char) temp;
                for (int j = 0; j < digit; j++) {
                    result += ch;
                }
                System.out.println(result);
            }

        }
    }
}
