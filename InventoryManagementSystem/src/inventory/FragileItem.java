package inventory;

import java.time.LocalDate;

public class FragileItem extends InventoryItem {

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
