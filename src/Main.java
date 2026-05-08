import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductManagement pm = new ProductManagement();
        List<Product> products = new ArrayList<>();
        products.add(new Product(3, "Clavier", 45.5));
        products.add(new Product(1, "Souris", 20));
        products.add(new Product(2, "Ecran", 350));
        products.add(pm.createProduct(() -> new Product(4, "Casque", 80)));
        pm.displayProducts(products, System.out::println);
        System.out.println(pm.returnProductsNames(products, Product::getNom));
        pm.displayProductsByFilter(products, p -> p.getPrix() >= 80, System.out::println);
        pm.sortProductsById(products, Comparator.comparingInt(Product::getId)).forEach(System.out::println);
        System.out.println(pm.convertToStream(products).count());
    }
}
