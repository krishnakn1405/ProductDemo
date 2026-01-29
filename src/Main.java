public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        // hey service add products
        Product p = new Product("Asus Vivobook", "Laptop", "Brown Table", 2022);
        service.addProduct(p);
    }
}