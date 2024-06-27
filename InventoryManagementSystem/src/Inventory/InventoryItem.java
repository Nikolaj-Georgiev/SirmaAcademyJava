package Inventory;

import Item.AbstractItem;

import java.time.LocalDate;

public abstract class InventoryItem extends AbstractItem {
    protected String id;
    protected int quantity;


    public InventoryItem(String id, int quantity, String name, String description, double price, String category, boolean perishable, boolean broken) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.perishable = perishable;
        this.initialDate = LocalDate.now();
    }
    
    public InventoryItem() {
    }

    public InventoryItem(String id) {
        this.id = id;
    }

    public InventoryItem(int quantity) {
        this.quantity = quantity;
    }

    public InventoryItem(String itemName, int quantity) {
        this.quantity = quantity;
        this.name = itemName;
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
    public double calculateValue(int quantity) {
        return 0;
    }


    @Override
    public void setInitialDate(LocalDate initialDate) {

    }
}
