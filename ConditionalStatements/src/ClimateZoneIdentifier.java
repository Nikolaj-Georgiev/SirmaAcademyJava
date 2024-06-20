import java.util.Scanner;

public class ClimateZoneIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double latitude = Double.parseDouble(sc.nextLine());
        String hemisphere = sc.nextLine();
        String result = "";

        if (latitude >= -90 && latitude <= 90 && latitude != 0) {
            if (Math.abs(latitude) > 66.5) {
                result = "Arctic Zone";
            } else if (Math.abs(latitude) > 23.5) {
                result = "Temperate Zone";
            } else if (Math.abs(latitude) > 0) {
                result = "Tropic Zone";
            }
        } else if (latitude == 0) {
            result = "Equator";
        }

        System.out.println(result);
        sc.close();
    }
}

// border values are not clear, so the result may be wrong for 2 values 66.5 and 23.5.