
public class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class EcommerceSearchFunction {

    public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId) {
                return p;
            }
        }
        return null;
    }
    
    public static Product binarySearch(Product[] products, int targetId) {
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Desk", "Furniture"),
            new Product(104, "Chair", "Furniture"),
            new Product(105, "Headphones", "Electronics")
        };

        Product found1 = linearSearch(products, 104);
        System.out.println("Linear search found: " + (found1 != null ? found1.productName : "not found"));
        Product found2 = binarySearch(products, 104);
        System.out.println("Binary search found: " + (found2 != null ? found2.productName : "not found"));
    }
}
