import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int dayAsNum = Integer.parseInt(input);
        String day;

        switch (dayAsNum) {
            case 1: {
                day = "Monday";
                break;
            }
            case 2: {
                day = "Tuesday";
                break;
            }
            case 3: {
                day = "Wednesday";
                break;
            }
            case 4: {
                day = "Thursday";
                break;
            }
            case 5: {
                day = "Friday";
                break;
            }
            case 6: {
                day = "Saturday";
                break;
            }
            case 7: {
                day = "Sunday";
                break;
            }
            default: {
                day = "Error";
            }
        }

        System.out.println(day);
        sc.close();
    }
}
