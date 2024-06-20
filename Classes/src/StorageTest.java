public class StorageTest {
    public static void main(String[] args) {
        StorageProduct productOne = new StorageProduct("cucumber",
                1.50, 15);
        StorageProduct productTwo = new StorageProduct("tomato",
                0.90, 25);
        StorageProduct productThree = new StorageProduct("bread",
                1.10, 8);


        Storage storage = new Storage(50);
        storage.addProduct(productOne);
        storage.addProduct(productTwo);
        storage.addProduct(productThree);
        String jsonStorage = storage.getProducts();
        System.out.println(jsonStorage);
        System.out.println(storage.capacity);
        System.out.print(storage.totalCost);

    }
}
