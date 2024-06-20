public class CarConstructors {
    private String brand;
    private String model = "unknown";
    private int horsePower = -1;

    public CarConstructors(String brand){
        this.brand = brand;
    }
    public CarConstructors(String brand, String model, int horsePower){
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }
    public CarConstructors(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return this.brand;
    }
    public String getModel() {
        return this.model;
    }
    public int getHorsePower() {
        return this.horsePower;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setHorsePower(int horsePower) {
        if (horsePower > 0) {
            this.horsePower = horsePower;
        } else {
            System.out.println("Invalid horsepower");
        }
    }
    public void carInfo(){
        System.out.println(STR."The car is: \{this.brand} \{this.model} – \{this.horsePower} HP.");
    }
}
