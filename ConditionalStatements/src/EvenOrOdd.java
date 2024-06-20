import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int number = Integer.parseInt(input);

        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        sc.close();
    }
}

