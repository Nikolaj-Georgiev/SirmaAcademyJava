import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int l = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 97; k < 97 + l; k++) {
                    for (int m = 97; m < 97 + l; m++) {
                        for (int o = 1; o <= n; o++) {
                            if (o > i && o > j) {
                                System.out.println(STR."\{i}\{j}\{(char) k}\{(char) m}\{o}");
                            }
                        }
                    }
                }
            }
        }
    }
}
