import java.util.*;

public class CarConstructorsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<String> carInputs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            carInputs.add(sc.nextLine());
        }

        ArrayList<CarConstructors> cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String> carInputs1 = Arrays.stream(carInputs.get(i).split(" ")).toList();
            System.out.println(carInputs1.toString());
            cars.add(AddCarToCollection(carInputs1));
        }
        for (CarConstructors car : cars) {
            car.carInfo();
        }

    }
    public static CarConstructors AddCarToCollection (List<String> carInputs){
        if (carInputs.size() == 2 ) {
            String brand = carInputs.get(0);
            String model = carInputs.get(1);
            return  new CarConstructors(brand, model);
        } else if (carInputs.size() == 3) {
            String brand = carInputs.get(0);
            String model = carInputs.get(1);
            int horsePower = Integer.parseInt(carInputs.get(2));
            return new CarConstructors(brand, model, horsePower);
        } else{
            return new CarConstructors(carInputs.getFirst());
        }

    }
}

