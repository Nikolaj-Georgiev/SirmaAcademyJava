import java.util.*;

public class CarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<String> carInputs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            carInputs.add(sc.nextLine());
        }

        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Car car = new Car();
            List<String> carInputs1 = Arrays.stream(carInputs.get(i).split(" ")).toList();
            car.setBrand(carInputs1.get(0));
            car.setModel(carInputs1.get(1));
            car.setHorsepower(Integer.parseInt(carInputs1.get(2)));
            cars.add(car);
        }
        for (Car car : cars) {
            car.carInfo();
        }

    }
}
