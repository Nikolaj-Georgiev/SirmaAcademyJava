import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vegetable = sc.nextLine();
        String dayOfWeek = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());

        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (vegetable) {
                    case "tomato":
                        System.out.printf("%.2f", (quantity * 2.80));
                        break;
                    case "onion":
                        System.out.printf("%.2f", (quantity * 1.30));
                        break;
                    case "lettuce":
                        System.out.printf("%.2f", (quantity * 0.85));
                        break;
                    case "cucumber":
                        System.out.printf("%.2f", (quantity * 1.75));
                        break;
                    case "pepper":
                        System.out.printf("%.2f", (quantity * 3.50));
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "Saturday":
            case "Sunday":
                switch (vegetable) {
                    case "tomato":
                        System.out.printf("%.2f", (quantity * 2.50));
                        break;
                    case "onion":
                        System.out.printf("%.2f", (quantity * 1.20));
                        break;
                    case "lettuce":
                        System.out.printf("%.2f", (quantity * 0.80));
                        break;
                    case "cucumber":
                        System.out.printf("%.2f", (quantity * 1.45));
                        break;
                    case "pepper":
                        System.out.printf("%.2f", (quantity * 5.50));
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
                break;
        }

        sc.close();
    }
}
