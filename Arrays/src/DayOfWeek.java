import java.util.Scanner;
import java.util.Arrays;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = Integer.parseInt(sc.nextLine());
        String[] daysArr = {
                "Monday" ,
                "Tuesday" ,
                "Wednesday" ,
                "Thursday" ,
                "Friday" ,
                "Saturday" ,
                "Sunday"
        };

        if(1 <= day && day <= 7){
            System.out.println(daysArr[day-1]);
        }

    }
}
