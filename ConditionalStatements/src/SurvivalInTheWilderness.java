import java.util.Scanner;

public class SurvivalInTheWilderness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String timeOfDay = sc.nextLine();
        String environment = sc.nextLine();
        String items = sc.nextLine();
        String result = "";

        if (timeOfDay.equals("day")) {
            if (environment.equals("forest")) {
                if (items.equals("knife")) {
                    result = "Hunt for food.";
                } else if (items.equals("container")) {
                    result = "Collect berries.";
                } else {
                    result = "Explore.";
                }
            } else if (environment.equals("desert")) {
                if (items.equals("hat")) {
                    result = "Search for water.";
                } else {
                    result = "Find shade.";
                }
            }
        }
        if (timeOfDay.equals("night")) {
            if (environment.equals("forest")) {
                if (items.equals("firestarter")) {
                    result = "Make a campfire.";
                } else {
                    result = "Climb a tree for safety.";
                }
            } else if (environment.equals("desert")) {
                if (items.equals("blanket")) {
                    result = "Sleep.";
                } else {
                    result = "Keep moving to stay warm.";
                }
            }
        }

        System.out.println(result);
        sc.close();
    }
}
