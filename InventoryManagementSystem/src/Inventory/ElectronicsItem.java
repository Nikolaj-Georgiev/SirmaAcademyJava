package Inventory;

import java.io.Serial;
import java.time.LocalDate;

public class ElectronicsItem extends InventoryItem {
    @Serial
    private static final long serialVersionUID = 1L;

    public ElectronicsItem() {
        super();
    }

    public ElectronicsItem(String name, String description, double price, String category, int quantity) {
        super(name, description, price, category, quantity);
        this.setInitialDate(LocalDate.now());
    }

    @Override
    public double calculateValue(int quantity) {
        return this.getPrice() * this.getQuantity();

    }

}
