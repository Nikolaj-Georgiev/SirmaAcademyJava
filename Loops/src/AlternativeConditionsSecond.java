import java.util.Scanner;

public class AlternativeConditionsSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int count = 0;
        int numbers = 0;
        boolean flag = false;
        while (count != n) {
            count++;

            for (int j = n - count; j > count; j -= 2) {
                System.out.print(" ");
            }
            for (int i = 1; i <= count; i++) {
                System.out.print(++numbers);
                if (numbers != 1) {
                    System.out.print(" ");
                }
                if (numbers == n) {
                    flag = true;
                    break;
                }
            }
            System.out.println();
            if (flag) {
                break;
            }

        }
    }
}
