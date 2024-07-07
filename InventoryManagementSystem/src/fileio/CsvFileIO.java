package fileio;

import inventory.ElectronicsItem;
import inventory.FragileItem;
import inventory.GroceryItem;
import inventory.InventoryItem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFileIO {
    private static final String FILE_NAME = "inventory.csv";

    public static void saveInventory(List<InventoryItem> inventory) {

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

    public static List<InventoryItem> loadInventory() {
        List<InventoryItem> inventory = new ArrayList<InventoryItem>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line = br.readLine();
            line = br.readLine();
            while (line != null) {

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static InventoryItem parseCsvLine(String csv) {
        String[] values = csv.split(",");
        String id = values[0];
        String name = values[1];
        String description = values[2];
        double price = Double.parseDouble(values[3]);
        String category = values[4];
        int quantity = Integer.parseInt(values[5]);
        int expDays = Integer.parseInt(values[6]);

        if (category.equalsIgnoreCase("fragile")) {
            return new FragileItem(id, name, description, price, category, quantity);
        } else if (category.equalsIgnoreCase("grocery")) {
            return new GroceryItem(id, name, description, price, category, quantity, expDays);
        } else if (category.equalsIgnoreCase("electronics")) {
            return new ElectronicsItem(id, name, description, price, category, quantity);
        }
        return null;
    }

}
