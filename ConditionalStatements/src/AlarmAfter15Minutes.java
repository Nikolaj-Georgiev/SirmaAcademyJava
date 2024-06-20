import java.util.Scanner;

public class AlarmAfter15Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int addedMinutes = minute + 15;
        if (addedMinutes > 59) {
            hour += 1;
            addedMinutes = addedMinutes - 60;
            if (hour < 23) {
                System.out.printf("%02d:%02d", hour, addedMinutes);
            } else {
                hour = 0;
                System.out.printf("%02d:%02d", hour, addedMinutes);
            }
        } else {
            System.out.printf("%02d:%02d", hour, addedMinutes);
        }

        sc.close();
    }
}
