import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        printingTriangle(n);

    }
    
    private static void printingTriangle(int n) {
        String resultString = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                resultString += STR."\{j} ";
            }
            System.out.println(resultString.trim());
            resultString = "";
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                resultString += STR."\{j} ";
            }
            System.out.println(resultString.trim());
            resultString = "";
        }
    }
}
