package item;

public interface Item {
    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    double calculateValue(int quantity);

}
