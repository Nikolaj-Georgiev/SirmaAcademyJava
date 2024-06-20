import java.util.Scanner;

public class NewBuilding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int floors = Math.abs(Integer.parseInt(sc.nextLine()));
        int rooms = Math.abs(Integer.parseInt(sc.nextLine()));
        String type = "";

        for (int i = floors; i >= 1; i--) {
            
            if (i == floors) {
                type = "L";
            } else if (i % 2 == 1) {
                type = "A";
            } else {
                type = "O";
            }

            String result = "";

            for (int j = 0; j < rooms; j++) {
                result += type + i + j + " ";
            }
            System.out.println(result);
        }
    }
}
