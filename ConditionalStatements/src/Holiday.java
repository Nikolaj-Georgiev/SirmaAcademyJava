import java.util.Scanner;

public class Holiday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();

        if (budget < 10 || budget > 5000) {
            return;
        }
        /* this range is declared in the condition, therefore the program does not work out of it. */

        if (budget <= 100) {
            if (season.equals("summer")) {
                System.out.printf("Somewhere in Bulgaria%nCamp - %.2f", (budget * 0.30));
            } else if (season.equals("winter")) {
                System.out.printf("Somewhere in Bulgaria%nHotel - %.2f", (budget * 0.70));
            }
        } else if (budget <= 1000) {
            if (season.equals("summer")) {
                System.out.printf("Somewhere in Europe%nCamp - %.2f", (budget * 0.40));
            } else if (season.equals("winter")) {
                System.out.printf("Somewhere in Europe%nHotel - %.2f", (budget * 0.80));
            }
        } else if (budget > 1000) {
            switch (season) {
                case "summer":
                case "winter":
                    System.out.printf("Somewhere in Asia%nHotel - %.2f", (budget * 0.90));
                    break;
            }

        }

        sc.close();
    }
}
