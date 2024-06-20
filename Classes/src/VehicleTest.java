public class VehicleTest {
    public static void main(String[] args) {
        Engine engine = new Engine(100);
        Vehicle vehicle = new Vehicle("a", "b", engine, 200);
        vehicle.drive(100);
        System.out.println(vehicle.fuel());
    }
}