import java.util.Scanner;

public class FaceOfFigures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String form = sc.nextLine();
        double firstInputNum = Double.parseDouble(sc.nextLine());
        double face = 0;


        switch (form) {
            case "circle": {
                face = Math.PI * Math.pow(firstInputNum, 2);
                break;
            }
            case "rectangle": {
                double b = Double.parseDouble(sc.nextLine());
                face = firstInputNum * b;
                break;
            }
            case "square": {
                face = Math.pow(firstInputNum, 2);
                break;
            }
            case "triangle": {
                double h = Double.parseDouble(sc.nextLine());
                face = (firstInputNum * h) / 2;
                break;
            }
        }

        System.out.printf("%.2f", face);
        sc.close();
    }
}
