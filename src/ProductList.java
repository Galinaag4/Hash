import java.util.HashSet;
import java.util.Set;

public class ProductList {

    static Set<Product> productList = new HashSet<>();

    public static void addProduct(Product product) {
        try {
            if (!productList.contains(product)) {
                productList.add(product);
            } else if (product.hashCode() == productList.hashCode()) {
                throw new RuntimeException("Продукт" + product.getName() + "уже имеется в сумке!");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
