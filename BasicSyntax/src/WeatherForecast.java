public class WeatherForecast {
    public static void main(String[] args) {
        String town = "Sofia";
        double degrees = 22.567;
        int num = 12;

        String formatedNumber = String.format("%07d qkooo", num);
        System.out.println(formatedNumber);
        System.out.printf("Today in %s it is %.2f degrees.", town, degrees);
    }
}
