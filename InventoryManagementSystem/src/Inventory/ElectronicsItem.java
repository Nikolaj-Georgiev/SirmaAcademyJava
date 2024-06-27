package Inventory;

import java.time.LocalDate;

public class ElectronicsItem extends InventoryItem {

    public ElectronicsItem() {
    }

    public ElectronicsItem(String itemName) {
        setName(itemName);
    }

    public ElectronicsItem(String itemName, int quantity) {
        setName(itemName);
        setQuantity(quantity);
    }

    public ElectronicsItem(String id, int quantity, String name, String description, double price, String category) {
        setId(id);
        setQuantity(quantity);
        setName(name);
        setDescription(description);
        setPrice(price);
        setCategory(category);
        setInitialDate(LocalDate.now());
    }

    @Override
    public double calculateValue(int quantity) {
        return this.getPrice() * this.getQuantity();

    }
}
