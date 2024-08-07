package cli;


import inventory.*;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class InventoryCLI {
    private final InventoryManager inventoryManager = new InventoryManager();
    private final Scanner scanner = new Scanner(System.in);

    private static boolean isValidNumber(String input, String type) {
        try {
            if ("integer".equalsIgnoreCase(type)) {
                Integer.parseInt(input);
            } else if ("double".equalsIgnoreCase(type)) {
                Double.parseDouble(input);
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static Number readValidNumber(Scanner scanner, String prompt, String type) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine();
            if (isValidNumber(input, type)) {
                if ("integer".equalsIgnoreCase(type)) {
                    return Integer.parseInt(input);
                } else if ("double".equalsIgnoreCase(type)) {
                    return Double.parseDouble(input);
                }
            } else {
                System.out.println(STR."Invalid input. Please enter a valid \{type.equalsIgnoreCase("double") ? "real number" : "integer"}.");
            }
        }
    }


    public void run() throws IOException {
        boolean exit = false;

        while (!exit) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    displayIDAndNAme();
                    break;
                case 4:
                    displayItems();
                    break;
                case 5:
                    categorizeItem();
                    break;
                case 6:
                    placeOrder();
                    break;
                case 7:
                    saveInventory();
                    break;
                case 8:
                    loadInventory();
                    break;
                case 9:
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
        System.out.println();
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item by ID");
        System.out.println("3. Display Items by ID and Name");
        System.out.println("4. Display Items");
        System.out.println("5. Categorize Item");
        System.out.println("6. Place Order");
        System.out.println("7. Save Inventory");
        System.out.println("8. Load Inventory");
        System.out.println("9. Exit");
        System.out.println();
        System.out.print("Enter your choice: ");
    }

    private void addItem() {
        System.out.print("Enter one of these item category -> (Grocery, Electronics, Fragile): ");
        String category = scanner.nextLine();

        System.out.print("Enter item name: ");
        String name = scanner.nextLine();

        System.out.print("Enter item description: ");
        String description = scanner.nextLine();

        double price = readValidNumber(scanner, "Enter item price: ", "double").doubleValue();

        int quantity = readValidNumber(scanner, "Enter item quantity: ", "integer").intValue();

        InventoryItem item;

        switch (category.toLowerCase()) {
            case "grocery":
                int expDays = readValidNumber(scanner, "Enter expiry days: ", "integer").intValue();
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

    private void displayIDAndNAme() {
        List<InventoryItem> items = inventoryManager.getItems();
        if (items.isEmpty()) {
            System.out.println("No items found.");
        } else {
            for (InventoryItem item : items) {
                System.out.println(STR."ID: \{item.getId()}, Name: \{item.getName()}");
            }
        }
    }

    private void displayItems() {
        List<InventoryItem> items = inventoryManager.getItems();
        if (items.isEmpty()) {
            System.out.println("No items found.");
        } else {
            for (InventoryItem item : items) {
                if (item != null) {
                    System.out.println(item.productDetails());
                } else {
                    System.out.println("Item cannot be categorized.");
                }
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
