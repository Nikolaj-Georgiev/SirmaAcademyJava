import java.util.ArrayList;

public class Storage {
    public int capacity;
    public double totalCost;
    private ArrayList<StorageProduct> products;

    public Storage(int capacity) {
        this.capacity = capacity;
        this.products = new ArrayList<>();
        this.totalCost = 0.0;
    }

    public String getProducts() {
        String jsonProducts = "[\n";
        for (int i = 0; i < products.size(); i++) {
            StorageProduct product = products.get(i);
            jsonProducts += "  {\n";
            jsonProducts += "    \"name\": \"" + product.getName() + "\",\n";
            jsonProducts += "    \"price\": " + product.getPrice() + "\n";
            jsonProducts += "    \"quantity\": " + product.getQuantity() + "\n";
            jsonProducts += "  }";
            if (i < products.size() - 1) {
                jsonProducts += ",\n";
            } else {
                jsonProducts += "\n";
            }
        }
        jsonProducts += "]";
        return jsonProducts;
    }

    public void addProduct(StorageProduct product) {
        if (product.getQuantity() <= capacity && !products.contains(product)) {
            products.add(product);
            capacity -= product.getQuantity();
            totalCost += product.getPrice() * product.getQuantity();
        }
    }
}
