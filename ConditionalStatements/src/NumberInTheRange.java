import java.util.Scanner;

public class NumberInTheRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double number = Double.parseDouble(input);
        
        if (number <= 100 && number >= -100 && number != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
