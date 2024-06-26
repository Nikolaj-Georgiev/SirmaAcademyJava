package Item;

public interface Item {
    public String getName();
    public void setName(String name);
    public String getDescription();
    public void setDescription(String description);
    public double calculateValue(int quantity);

}
