package inventory;

import fileio.CsvFileIO;

import java.io.IOException;
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

    public boolean removeItem(String id) {
        return inventory.removeIf(item -> item.getId().equals(id));
    }

    public List<InventoryItem> getItems() {
        return new ArrayList<>(inventory);
    }

    public boolean categorizeItem(String id, String category) {
        for (InventoryItem inventoryItem : inventory) {
            if (inventoryItem.getId().equals(id)) {
                inventoryItem.setCategory(category);
                return true;
            }

        }
        return false;
    }

    public void saveInventory() throws IOException {
        CsvFileIO.saveInventory(inventory);
    }

    public void loadInventory() throws IOException {
        inventory = CsvFileIO.loadInventory();
    }
}

