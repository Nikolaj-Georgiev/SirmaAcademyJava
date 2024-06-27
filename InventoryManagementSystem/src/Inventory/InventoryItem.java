package Inventory;

import Item.AbstractItem;

public abstract class InventoryItem extends AbstractItem {
    protected String id;
    protected int quantity;

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

}
