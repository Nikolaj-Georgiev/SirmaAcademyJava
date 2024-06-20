public class Speed {
    public static void main(String[] args) {

        int distance = 600;
        int hours = 7;
        int minutes = 35;
        int seconds = 55;

        int totalSeconds = ((hours * 60)*60) + (minutes * 60) + seconds;
        double speed = (double) distance / totalSeconds;
        System.out.printf("%.6f",speed);
    }
}

//        Use the formula V = S/T where V - speed, S - distance, T - time
//100
//1
//20
//20

//0.020747

//2500
//5
//56
//23

//0.116915

//600
//7
//35
//55

//0.021934

