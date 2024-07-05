package inventory;

import item.AbstractItem;

import java.io.Serializable;
import java.util.UUID;

public abstract class InventoryItem extends AbstractItem implements Serializable {
    private String id;
    private int quantity;

    public InventoryItem() {
        super();
    }

    public InventoryItem(String name, String description, double price, String category, int quantity) {
        super(name, description, price, category);
        this.id = UUID.randomUUID().toString();
        this.quantity = quantity;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public abstract double calculateValue(int quantity);

    public String productDetails() {
        return STR."Product details: Id: \{this.getId()}, InitialDate: \{this.getInitialDate()}, Name: \{this.getName()}, Description: \{this.getDescription()}, Price: \{this.getPrice()}, Category \{this.getCategory()}, Quantity: \{this.getQuantity()}";
    }

}
