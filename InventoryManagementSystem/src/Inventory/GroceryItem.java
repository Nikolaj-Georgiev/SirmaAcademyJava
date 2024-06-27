package Inventory;

import java.time.LocalDate;

public class GroceryItem extends InventoryItem {
    int expDays;

    public GroceryItem() {
        super();
    }

    public GroceryItem(String itemName) {
        super(itemName);
    }

    public GroceryItem(String itemName, int quantity) {
        super(itemName, quantity);
    }

    public GroceryItem(String id, int quantity, String name, String description, double price, String category, boolean perishable, boolean broken) {
        super(id, quantity, name, description, price, category, perishable, broken);
    }

    public GroceryItem(String id, int quantity, String name, String description, double price, String category, boolean perishable, boolean broken, int expDays) {
        super(id, quantity, name, description, price, category, perishable, broken);
        this.expDays = expDays;
    }

    public int getExpDays() {
        return expDays;
    }

    public void setExpDays(int expDays) {
        this.expDays = expDays;
    }

    @Override
    public void setInitialDate(LocalDate initialDate) {
        this.initialDate = initialDate;
    }

    @Override
    public LocalDate calculateExpiryDate(int days) {
        return initialDate.plusDays(days);
    }

    @Override
    public boolean isPerished() {
        return LocalDate.now().isAfter(calculateExpiryDate(expDays));

    }

    @Override
    public double calculateValue(int quantity) {
        if (!isPerished()) {
            return this.price * this.quantity;
        } else {
            throw new IllegalStateException("The product has perished due to expiry date!");
        }
    }
}
