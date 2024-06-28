package Inventory;

import Item.AbstractItem;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

public abstract class InventoryItem extends AbstractItem implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String id;
    private int quantity;

    public InventoryItem(String name, String description, double price, String category, int quantity) {
        super(name, description, price, category);
        this.id = UUID.randomUUID().toString();
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
            return;
        }
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.isEmpty()) {
            this.id = "Not Valid Data";
            return;
        }
        this.id = id;
    }

    @Override
    public abstract double calculateValue(int quantity);

    public String productDetails() {
        return STR."Product details: Id: \{this.getId()}, InitialDate: \{this.getInitialDate()}, Name: \{this.getName()}, Description: \{this.getDescription()}, Price: \{this.getPrice()}, Category \{this.getCategory()}, Quantity: \{this.getQuantity()}";
    }

}
