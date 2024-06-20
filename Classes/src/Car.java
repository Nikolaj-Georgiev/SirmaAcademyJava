import static java.lang.StringTemplate.STR;

public class Car {
    private String brand;
    private String model;
    private int horsepower;

    public String getBrand() {
        return this.brand;
    }
    public String getModel() {
        return this.model;
    }
    public int getHorsepower() {
        return this.horsepower;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setHorsepower(int horsepower) {
        if (horsepower > 0) {
            this.horsepower = horsepower;
        } else {
            System.out.println("Invalid horsepower");
        }
    }
    public void carInfo(){
        System.out.println(STR."The car is: \{this.brand} \{this.model} – \{this.horsepower} HP.");
    }
}
