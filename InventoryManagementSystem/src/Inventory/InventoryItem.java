package Inventory;

import Item.AbstractItem;

public class InventoryItem extends AbstractItem {
    protected String id;
    protected int quantity;

    public InventoryItem(String id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public InventoryItem() {
    }

    public InventoryItem(String id) {
        this.id = id;
    }

    public InventoryItem(int quantity) {
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
}
