public class Playground {
    public static void main(String[] args) {
        int start = 100000;
        int end = 100050;
        printNumbers(start, end);

        start = 299900;
        end = 300000;
        printNumbers(start, end);

        start = 100115;
        end = 100120;
        printNumbers(start, end);
    }

    public static void printNumbers(int start, int end) {
        boolean found = false;
        for (int i = start + 1; i < end; i++) {
            if (checkCondition(i)) {
                System.out.println(i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("None");
        }
    }

    public static boolean checkCondition(int number) {
        int evenPositionSum = 0;
        int oddPositionSum = 0;
        String numberStr = Integer.toString(number);

        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            if (i % 2 == 0) {
                evenPositionSum += digit;
            } else {
                oddPositionSum += digit;
            }
        }

        return evenPositionSum == oddPositionSum;
    }

}
