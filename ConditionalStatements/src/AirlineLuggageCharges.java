import java.util.Scanner;

public class AirlineLuggageCharges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int weight = Integer.parseInt(sc.nextLine());
        int size = Integer.parseInt(sc.nextLine());
        int overweightFee = 0;
        int oversizeFee = 0;
        String weightText = "";
        String sizeText = "";
        String result = "";

        if (weight > 50) {
            overweightFee = 100;
            weightText = "Overweight";
        }

        if (size > 158) {
            if ((size - 158) > 50) {
                oversizeFee = 200;
                sizeText = "Oversize";
            } else if ((size - 158) > 20) {
                oversizeFee = 100;
                sizeText = "Oversize";
            } else {
                oversizeFee = 50;
                sizeText = "Oversize";
            }
        }

        if (overweightFee > 0 && oversizeFee > 0) {
            result = "$" + (overweightFee + oversizeFee + 50) + " (" + weightText + " + " + sizeText + " + Handling)";
        } else if (overweightFee > 0) {
            result = "$" + overweightFee + " (" + weightText + ")";
        } else {
            result = "$" + oversizeFee + " (" + sizeText + ")";
        }

        System.out.println(result);
        sc.close();
    }
}
