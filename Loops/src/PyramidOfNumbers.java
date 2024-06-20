import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        if (n == 0) {
            System.out.println("No pyramid of numbers");
            return;
        }

        String resultString = "";
        int counter = 1;
        boolean flag = false;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (counter > n) {
                    flag = true;
                    break;
                }

                resultString += counter + " ";
                counter++;
            }

            System.out.println(resultString);
            resultString = "";

            if (flag) {
                break;
            }
        }
    }
}
