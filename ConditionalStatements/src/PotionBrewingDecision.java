import java.util.Scanner;

public class PotionBrewingDecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ingredient1 = sc.nextLine();
        String ingredient2 = sc.nextLine();
        String result = "Can't brew any potion.";

        if (ingredient1.equals("herbs") || ingredient2.equals("herbs")) {
            if (ingredient1.equals("water") || ingredient2.equals("water")) {
                result = "Brew a health potion.";
            } else if (ingredient1.equals("oil") || ingredient2.equals("oil")) {
                result = "Brew a stealth potion.";
            } else {
                result = "Brew a minor stamina potion.";
            }
        } else if (ingredient1.equals("berries") || ingredient2.equals("berries")) {
            if (ingredient1.equals("sugar") || ingredient2.equals("sugar")) {
                result = "Brew a speed potion.";
            } else {
                result = "Brew a minor energy potion.";
            }
        }

        System.out.println(result);
        sc.close();
    }
}
