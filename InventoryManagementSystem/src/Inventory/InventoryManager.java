package Inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<InventoryItem> inventory;

    public InventoryManager() {
        inventory = new ArrayList<InventoryItem>();
    }

    public void addItem(InventoryItem inventoryItem) {
        inventory.add(inventoryItem);
    }

    public void removeItem(String id) {
        inventory.removeIf(item -> item.getId().equals(id));
    }

    public List<InventoryItem> getItems() {
        return new ArrayList<>(inventory);
    }

}
