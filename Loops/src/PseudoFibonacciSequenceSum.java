import java.util.Scanner;

public class PseudoFibonacciSequenceSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Math.abs(Integer.parseInt(sc.nextLine()));

        if (n == 0 || n == 1){
            System.out.println(n);
            return;
        }

        int sum = 0;
        int a = 0;
        int b = 1;

        for (int i = 0; i <= n; i++){
            sum += a;
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println(sum);
    }
}

