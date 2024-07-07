import cli.InventoryCLI;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        InventoryCLI inventoryCLI = new InventoryCLI();
        try {
            inventoryCLI.run();
        } catch (IOException e) {
            System.out.println(STR."An error occurred: \{e.getMessage()}");
        }
    }
}