package Inventory;

import java.time.LocalDate;

public class FragileItem extends InventoryItem {

    public FragileItem() {
    }

    public FragileItem(String itemName) {
        setName(itemName);
    }

    public FragileItem(String itemName, int quantity) {
        setName(itemName);
        setQuantity(quantity);
    }

    public FragileItem(String id, int quantity, String name, String description, double price, String category, boolean broken) {
        setId(id);
        setQuantity(quantity);
        setName(name);
        setDescription(description);
        setPrice(price);
        setCategory(category);
        setBroken(broken);
        setInitialDate(LocalDate.now());
    }


    @Override
    public boolean isBroken() {
        return super.isBroken();
    }

    public String getItemStatus() {
        return super.getItemStatus();
    }

    @Override
    public double calculateValue(int quantity) {
        if (!isBroken()) {
            return this.getPrice() * this.getQuantity();
        } else {
            throw new IllegalStateException("The product is broken!");
        }
    }
}
