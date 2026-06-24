public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(103, "Laptop", "Electronics"),
                new Product(101, "Phone", "Electronics"),
                new Product(104, "Shoes", "Fashion"),
                new Product(102, "Watch", "Accessories")
        };

        Product result = Search.linearSearch(products, 102);

        if (result != null)
            System.out.println("Linear Search: " + result.productName);

        result = Search.binarySearch(products, 102);

        if (result != null)
            System.out.println("Binary Search: " + result.productName);
    }
}
