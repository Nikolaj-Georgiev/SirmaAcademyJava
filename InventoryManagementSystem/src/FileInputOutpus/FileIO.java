package FileInputOutpus;

import Inventory.InventoryItem;

import java.io.*;
import java.util.List;

public class FileIO {
    private static final String FILE_NAME = "inventory.ser";

    public static void saveInventory(List<InventoryItem> inventory) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(inventory);
        }
    }

    public static List<InventoryItem> loadInventory() throws IOException, ClassNotFoundException {
        List<InventoryItem> inventory;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            inventory = (List<InventoryItem>) ois.readObject();
        }
        return inventory;
    }

}
