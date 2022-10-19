import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Product tomato = new Product("Томат", 100, 10.99);
        Product banana = new Product("Банан", 150, 3.58);
        Product potato = new Product("Картофель", 10, 30.00);
        Product orange = new Product("Апельсин", 50, 5.00);
        Product tomato1 = new Product("Томат", 100, 10.99);
        List<Product> product = List.of(tomato, banana, potato, orange,tomato1);
        for (Product e : product) {
            ProductList.addProduct(e);
        }
        System.out.println(ProductList.productList);

    }}
















