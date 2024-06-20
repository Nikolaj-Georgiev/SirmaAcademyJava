public class Vehicle {
    private String type;
    private String model;
    private Engine engine;
    private int fuel;

    public Vehicle(String type, String model, Engine engine, int fuel) {
        this.type = type;
        this.model = model;
        this.engine = engine;
        this.fuel = fuel;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int fuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void drive(int fuelLoss) {
        if (fuelLoss > 0 && fuelLoss <= fuel) {
            fuel -= fuelLoss;
        } else {
            System.out.println("Invalid fuel loss.");
        }
    }


}
