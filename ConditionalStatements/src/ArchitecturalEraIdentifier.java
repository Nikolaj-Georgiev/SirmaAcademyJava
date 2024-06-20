import java.util.Scanner;

public class ArchitecturalEraIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = Integer.parseInt(sc.nextLine());
        String material = sc.nextLine();
        String result = "";

        if (year < 500 && material.equals("stone")) {
            result = "Ancient";
        } else if (year >= 500 && year <= 1500 && material.equals("stone")) {
            result = "Medieval";
        } else if (year >= 1500 && year <= 1800 && material.equals("wood")) {
            result = "Colonial";
        } else if (year >= 1800 && year <= 1900 && material.equals("steel")) {
            result = "Industrial";
        } else if (year > 1900 && material.equals("steel")) {
            result = "Modern";
        } else {
            result = "Uncertain";
        }

        System.out.println(result);
        sc.close();
    }
}

//Different eras in history had specific architectural styles. The first line contains the year a
//building was constructed. The second line contains the primary material used in the building
//("wood", "stone", or "steel"). The application should attempt to guess the architectural era.
// Ancient: year < 500 and material = "stone"
// Medieval: year between 500 and 1500 and material = "stone"
// Colonial: year between 1500 and 1800 and material = "wood"
// Industrial: year between 1800 and 1900 and material = "steel"
// Modern: year > 1900 and material = "steel"
// Uncertain: Any other combinations