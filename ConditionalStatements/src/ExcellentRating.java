import java.util.Scanner;

public class ExcellentRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double mark = Double.parseDouble(input);
        
        if (mark >= 5.50 && mark <= 6) {
            System.out.println("Excellent");
        }

        sc.close();
    }
}
