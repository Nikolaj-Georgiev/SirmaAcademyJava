import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double speed = Double.parseDouble(input);
        String outputText = "";
        if (speed > 160) {
            outputText = "turbo-fast";
        } else if (speed <= 10) {
            outputText = "slow";
        } else if (speed <= 60) {
            outputText = "average";
        } else if (speed <= 120) {
            outputText = "fast";
        } else if (speed <= 160) {
            outputText = "super-fast";
        }

        System.out.println(outputText);
        sc.close();
    }
}
