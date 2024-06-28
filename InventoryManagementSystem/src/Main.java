import Inventory.ElectronicsItem;
import Inventory.GroceryItem;
import Inventory.InventoryItem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<InventoryItem> inventory = new ArrayList<>();
        inventory.add(new GroceryItem("Milk", "Fresh milk", 2.99, "Grocery", 7, 7));
        inventory.add(new GroceryItem("Bread", "Freshly baked bread", 1.99, "Grocery", 3, 3));
        inventory.add(new ElectronicsItem("Laptop", "Gaming laptop", 999.99, "Electronics", 2));
        for (InventoryItem item : inventory) {
            System.out.println(item.productDetails());
        }

    }
}