public class Time {
    public static void main(String[] args) {
//        60 01:00
//90 01:30
//325 05:25
        int time = 325;
        int hours = time / 60;
        int minutes = time % 60;
        System.out.printf("%02d:%02d", hours, minutes);
    }
}
