import java.util.Scanner;

public class ExcelColumnNameToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String intput = sc.nextLine();
        int number = 0;
        int len = intput.length();
        for (int i = 0; i < len; i++) {
            char ch = intput.charAt(i);
            int val = ch - 'A' + 1;
            number = number * 26 + val;
        }
        System.out.println(number);

    }
}
//Формулата за "CZ" ще бъде:
//3×26^1 + 26*26^0 = 3×26+26×1=78+26=104
// това го видях от нета и реално нямаше да мога да я реша сам. Сега поне знам за позиционните системи :)
