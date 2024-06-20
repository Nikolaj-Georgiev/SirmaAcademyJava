import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        if (3 <= n && n <= 100) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n * 2; j++) {
                    if (i == 1 || i == n) {
                        System.out.print("*");
                    } else {
                        if (j == 1 || j == n * 2) {
                            System.out.print("*");
                        } else {
                            System.out.print("/");
                        }
                    }
                }
//                if (i == n / 2) { // Така ми приличат повече на слънчви очила! :)
                if (i == Math.round((float) n / 2)) {
                    for (int k = 1; k <= n; k++) {
                        System.out.print("|");
                    }
                } else {
                    for (int m = 1; m <= n; m++) {
                        System.out.print(" ");
                    }
                }
                for (int l = 1; l <= n * 2; l++) {
                    if (i == 1 || i == n) {
                        System.out.print("*");
                    } else {
                        if (l == 1 || l == n * 2) {
                            System.out.print("*");
                        } else {
                            System.out.print("/");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
