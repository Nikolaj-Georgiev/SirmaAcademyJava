package inventory;

import java.time.LocalDate;

public class ElectronicsItem extends InventoryItem {

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
