import java.util.Scanner;

public class MovieClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = Integer.parseInt(sc.nextLine());
        String movies = "";

        if (age <= 0) {
            sc.close();
            return;
        }

        if (age >= 18) {
            movies = "All movies";
        } else if (age >= 13) {
            movies = "U and PG-13 rated movies.";
        } else {
            movies = "Only U-rated movies.";
        }

        System.out.println(movies);
        sc.close();
    }
}
