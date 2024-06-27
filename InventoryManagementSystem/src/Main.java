import FileInputOutpus.FileIO;
import Inventory.ElectronicsItem;
import Inventory.GroceryItem;
import Inventory.InventoryItem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<InventoryItem> inventory = new ArrayList<>();
        inventory.add(new GroceryItem("1", 10, "Milk", "Fresh milk", 2.99, "Grocery", true, 7));
        inventory.add(new GroceryItem("2", 20, "Bread", "Freshly baked bread", 1.99, "Grocery", false, 3));
        inventory.add(new ElectronicsItem("3", 5, "Laptop", "Gaming laptop", 999.99, "Electronics"));

        try {
            FileIO.saveInventory(inventory);
            List<InventoryItem> loadedInventory = FileIO.loadInventory();

            for (InventoryItem item : loadedInventory) {
                System.out.println(item.getId());
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

    }
}