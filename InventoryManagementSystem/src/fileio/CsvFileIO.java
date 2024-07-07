package fileio;

import inventory.GroceryItem;
import inventory.InventoryItem;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvFileIO {
    private static final String FILE_NAME = "inventory.csv";

    private static void saveInventory(List<InventoryItem> inventory) {

        try (FileWriter fw = new FileWriter(FILE_NAME)) {
            fw.append("ID,Name,Description,Price,Category,Quantity,ExpDays\n");
            for (InventoryItem i : inventory) {
                fw.append(itemToCsvString(i)).append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String itemToCsvString(InventoryItem item) {
        StringBuilder sb = new StringBuilder();
        sb.append(item.getId()).append(",");
        sb.append(item.getName()).append(",");
        sb.append(item.getDescription()).append(",");
        sb.append(item.getPrice()).append(",");
        sb.append(item.getCategory()).append(",");
        sb.append(item.getQuantity()).append(",");

        if (item instanceof GroceryItem groceryItem) {
            sb.append(groceryItem.getExpDays());
        }
        return sb.toString();
    }
}
