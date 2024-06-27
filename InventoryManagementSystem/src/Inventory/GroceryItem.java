package Inventory;

import java.time.LocalDate;

public class GroceryItem extends InventoryItem {
    private int expDays;

    public GroceryItem() {
    }

    public GroceryItem(String itemName) {
        setName(itemName);
    }

    public GroceryItem(String itemName, int quantity) {
        setName(itemName);
        setQuantity(quantity);
    }

    public GroceryItem(String id, int quantity, String name, String description, double price, String category, boolean perishable) {
        setId(id);
        setQuantity(quantity);
        setName(name);
        setDescription(description);
        setPrice(price);
        setCategory(category);
        setPerishable(perishable);
        setInitialDate(LocalDate.now());
    }

    public GroceryItem(String id, int quantity, String name, String description, double price, String category, boolean perishable, int expDays) {
        setId(id);
        setQuantity(quantity);
        setName(name);
        setDescription(description);
        setPrice(price);
        setCategory(category);
        setPerishable(perishable);
        setInitialDate(LocalDate.now());
        this.expDays = expDays;
    }

    public int getExpDays() {
        return expDays;
    }

    public void setExpDays(int expDays) {
        this.expDays = expDays;
    }

    @Override
    public LocalDate calculateExpiryDate(int days) {
        return getInitialDate().plusDays(days);
    }

    @Override
    public boolean isPerished() {
        return LocalDate.now().isAfter(calculateExpiryDate(expDays));

    }

    @Override
    public double calculateValue(int quantity) {
        if (!isPerished()) {
            return this.getPrice() * this.getQuantity();
        } else {
            throw new IllegalStateException("The product has perished due to expiry date!");
        }
    }
}
