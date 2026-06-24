import java.util.Arrays;
import java.util.Comparator;

public class Search {

    public static Product linearSearch(Product[] products, int id) {
        for (Product p : products) {
            if (p.productId == id)
                return p;
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int id) {

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        int low = 0, high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (products[mid].productId == id)
                return products[mid];

            if (products[mid].productId < id)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }
}