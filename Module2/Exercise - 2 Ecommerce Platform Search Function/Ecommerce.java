import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return productId + " - " + productName + " - " + category;
    }
}

class LinearSearch {

    public static Product search(Product[] products, int targetId) {

        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }
}

class BinarySearch {

    public static Product search(Product[] products, int targetId) {

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            }

            if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }
}

public class Ecommerce {

    public static void main(String[] args) {

        Product[] products = {

            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mouse", "Electronics"),
            new Product(103, "Keyboard", "Electronics"),
            new Product(104, "Shoes", "Fashion"),
            new Product(105, "Watch", "Accessories")
        };

        int target = 103;

        System.out.println("Linear Search");

        Product result1 = LinearSearch.search(products, target);

        if (result1 != null)
            System.out.println("Found: " + result1);
        else
            System.out.println("Product Not Found");

        System.out.println();

        System.out.println("Binary Search");

        Product result2 = BinarySearch.search(products, target);

        if (result2 != null)
            System.out.println("Found: " + result2);
        else
            System.out.println("Product Not Found");
    }
}
