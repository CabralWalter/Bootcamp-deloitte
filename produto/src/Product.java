public class Product {

    int id;
    String name;
    double price;
    int quantity;

    void showData() {
        System.out.println("\n--- Dados do Produto ---");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + name);
        System.out.println("Preço: " + price);
        System.out.println("Quantidade: " + quantity);
    }
}