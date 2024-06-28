package Inventory;

import java.io.Serial;
import java.time.LocalDate;

public class FragileItem extends InventoryItem {
    @Serial
    private static final long serialVersionUID = 1L;

    public FragileItem() {
        super();
    }

    public FragileItem(String name, String description, double price, String category, int quantity) {
        super(name, description, price, category, quantity);
        this.setInitialDate(LocalDate.now());
    }

    @Override
    public double calculateValue(int quantity) {
        if (!this.getBroken().equals("Broken")) {
            return this.getPrice() * this.getQuantity();
        } else {
            throw new IllegalStateException("The product is broken!");
        }
    }
}
