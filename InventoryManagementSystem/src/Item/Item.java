package Item;

public interface Item {
    public String getName();
    public String getDescription();
    public int getPrice();
    public double calculateValue(int quantity);

}
