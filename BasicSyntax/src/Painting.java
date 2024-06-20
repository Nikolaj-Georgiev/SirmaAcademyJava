import java.util.Scanner;

public class Painting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPaint = Integer.parseInt(sc.nextLine());
        double redPaint = totalPaint / 13.0;
        double yellowPaint = 4 * redPaint;
        double whitePaint = 8 * redPaint;
        System.out.printf("%.4f %n",redPaint);
        System.out.printf("%.4f %n",yellowPaint);
        System.out.printf("%.4f",whitePaint);

        sc.close();
    }
}

//150
// Red: 11.5385
//Yellow: 46.1538
//White: 92.3077
//120
// Red: 9.2308
//Yellow: 36.9231
//White: 73.8462
//630
// Red: 48.4615
//Yellow: 193.8462
//White: 387.6923