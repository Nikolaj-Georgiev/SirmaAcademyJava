import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double money = Double.parseDouble(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());
        double lightSaberPrice = Double.parseDouble(sc.nextLine());
        double robePrice = Double.parseDouble(sc.nextLine());
        double beltPrice = Double.parseDouble(sc.nextLine());
        double equipmentPrice = lightSaberPrice * Math.ceil(students * 1.1);

        for (int i = 1; i <= students; i++) {
            if (i % 6 == 0) {
                equipmentPrice += robePrice;
            } else {
                equipmentPrice += beltPrice + robePrice;
            }
        }

        if (money >= equipmentPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", equipmentPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", (equipmentPrice - money));
        }

    }
}
