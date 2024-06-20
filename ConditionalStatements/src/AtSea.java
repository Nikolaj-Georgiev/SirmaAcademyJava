import java.util.Scanner;

public class AtSea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double daysToStay = Double.parseDouble(sc.nextLine());
        String typeOfRoom = sc.nextLine();
        String assessment = sc.nextLine();
        double totalPrice = daysToStay - 1;
        boolean isValidRoom = typeOfRoom.equals("single room") || typeOfRoom.equals("apartment") || typeOfRoom.equals("president apartment");
        boolean isValidAssessment = assessment.equals("positive") || assessment.equals("negative");
        boolean isValidDays = daysToStay >= 0 && daysToStay <= 365;

        if (!isValidDays || !isValidAssessment || !isValidRoom) {
            sc.close();
            return;
        }

        if (daysToStay < 10) {
            switch (typeOfRoom) {
                case "single room":
                    totalPrice = totalPrice * 25;
                    break;
                case "apartment":
                    totalPrice = (totalPrice * 50) * 0.70;
                    break;
                case "president apartment":
                    totalPrice = (totalPrice * 100) * 0.90;
                    break;
                default:
                    break;
            }
        } else if (daysToStay <= 15) {
            switch (typeOfRoom) {
                case "single room":
                    totalPrice = totalPrice * 25;
                    break;
                case "apartment":
                    totalPrice = (totalPrice * 50) * 0.65;
                    break;
                case "president apartment":
                    totalPrice = (totalPrice * 100) * 0.85;
                    break;
                default:
                    break;
            }
        } else {
            switch (typeOfRoom) {
                case "single room":
                    totalPrice = totalPrice * 25;
                    break;
                case "apartment":
                    totalPrice = (totalPrice * 50) * 0.50;
                    break;
                case "president apartment":
                    totalPrice = (totalPrice * 100) * 0.80;
                    break;
                default:
                    break;
            }
        }

        if (assessment.equals("positive")) {
            totalPrice = totalPrice * 1.25;
        } else {
            totalPrice = totalPrice * 0.90;
        }

        System.out.printf("%.2f", totalPrice);
        sc.close();
    }
}


