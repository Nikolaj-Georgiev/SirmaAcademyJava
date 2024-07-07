package cli;


import inventory.*;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class InventoryCLI {
    private final InventoryManager inventoryManager = new InventoryManager();
    private final Scanner scanner = new Scanner(System.in);

    public void run() throws IOException {
        boolean exit = false;

        while (!exit) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());
//            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    displayItems();
                    break;
                case 4:
                    categorizeItem();
                    break;
                case 5:
                    placeOrder();
                    break;
                case 6:
                    saveInventory();
                    break;
                case 7:
                    loadInventory();
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private void showMenu() {
        System.out.println("\nInventory Management System");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item by ID");
        System.out.println("3. Display Items");
        System.out.println("4. Categorize Item");
        System.out.println("5. Place Order");
        System.out.println("6. Save Inventory");
        System.out.println("7. Load Inventory");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
    }

    private void addItem() {
        System.out.print("Enter item type (Grocery, Electronics, Fragile): ");
        String itemType = scanner.nextLine();

        System.out.print("Enter item name: ");
        String name = scanner.nextLine();

        System.out.print("Enter item description: ");
        String description = scanner.nextLine();

        System.out.print("Enter item price: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter item category: ");
        String category = scanner.nextLine();

        System.out.print("Enter item quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        InventoryItem item;

        switch (itemType.toLowerCase()) {
            case "grocery":
                System.out.print("Enter expiry days: ");
                int expDays = Integer.parseInt(scanner.nextLine());
                item = new GroceryItem(name, description, price, category, quantity, expDays);
                break;
            case "electronics":
                item = new ElectronicsItem(name, description, price, category, quantity);
                break;
            case "fragile":
                item = new FragileItem(name, description, price, category, quantity);
                break;
            default:
                System.out.println("Invalid item type.");
                return;
        }

        inventoryManager.addItem(item);
        System.out.println("Item added successfully.");
    }

    private void removeItem() {
        System.out.print("Enter item ID to remove: ");
        String itemId = scanner.nextLine();
        boolean success = inventoryManager.removeItem(itemId);
        if (success) {
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

    private void displayItems() {
        List<InventoryItem> items = inventoryManager.getItems();
        for (InventoryItem item : items) {
            if (item != null) {
                System.out.println(item.productDetails());
            } else {
                System.out.println("Item cannot be categorized.");
            }
        }
    }

    private void categorizeItem() {
        System.out.print("Enter item ID to categorize: ");
        String itemId = scanner.nextLine();

        System.out.print("Enter new category: ");
        String category = scanner.nextLine();

        boolean success = inventoryManager.categorizeItem(itemId, category);
        if (success) {
            System.out.println("Item categorized successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

    private void placeOrder() {
        // Implement order placement logic here
    }

    private void saveInventory() {
        try {
            inventoryManager.saveInventory();
            System.out.println("Inventory saved successfully.");
        } catch (IOException e) {
            System.out.println(STR."Failed to save inventory: \{e.getMessage()}");
        }
    }

    private void loadInventory() {
        try {
            inventoryManager.loadInventory();
            System.out.println("Inventory loaded successfully.");
        } catch (IOException e) {
            System.out.println(STR."Failed to load inventory: \{e.getMessage()}");
        }
    }
}
