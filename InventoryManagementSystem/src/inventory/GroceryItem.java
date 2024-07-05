package inventory;

import java.time.LocalDate;

public class GroceryItem extends InventoryItem {
    private int expDays;

    public GroceryItem() {
        super();
    }

    public GroceryItem(String name, String description, double price, String category, int quantity, int expDays) {
        super(name, description, price, category, quantity);
        this.expDays = expDays;
        this.setInitialDate(LocalDate.now());
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

    @Override
    public String productDetails() {
        return STR."\{super.productDetails()}, Expiry days: \{this.getExpDays()}.";
    }
}
