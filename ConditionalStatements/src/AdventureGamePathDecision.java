import java.util.Scanner;

public class AdventureGamePathDecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String rightHand = sc.nextLine();
        String leftHand = sc.nextLine();
        String result = "Wander aimlessly";

        if (rightHand.equals("sword") || leftHand.equals("sword")) {
            if (leftHand.equals("shield") || rightHand.equals("shield")) {
                result = "Take the path to the castle.";
            } else {
                result = "Take the path to the forest.";
            }
        } else if (rightHand.equals("map") || leftHand.equals("map")) {
            if (leftHand.equals("coins") || rightHand.equals("coins")) {
                result = "Go to the town.";
            } else {
                result = "Camp at the current spot and prepare for the next day.";
            }
        }

        System.out.println(result);
        sc.close();
    }
}
