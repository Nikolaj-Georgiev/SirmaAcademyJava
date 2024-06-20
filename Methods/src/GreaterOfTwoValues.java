import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        switch (type) {
            case "int": {
                int firstValue = Integer.parseInt(sc.nextLine());
                int secondValue = Integer.parseInt(sc.nextLine());
                System.out.println(getMax(firstValue, secondValue));
                break;
            }
            case "char": {
                char firstValue = sc.nextLine().charAt(0);
                char secondValue = sc.nextLine().charAt(0);
                System.out.println(getMax(firstValue, secondValue));
                break;
            }
            case "string": {
                String firstValue = sc.nextLine();
                String secondValue = sc.nextLine();
                System.out.println(getMax(firstValue, secondValue));
            }
        }
    }

    public static int getMax(int firstValue, int secondValue) {
        return Math.max(firstValue, secondValue);
    }

    public static char getMax(char firstValue, char secondValue) {
        if (firstValue >= secondValue) {
            return firstValue;
        } else {
            return secondValue;
        }
    }

    public static String getMax(String firstValue, String secondValue) {
        if (firstValue.compareTo(secondValue) > 0) {
            return firstValue;
        } else {
            return secondValue;
        }
    }
}
