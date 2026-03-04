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

    void updateData(int newId, String newName, double newPrice, int newQuantity) {
        id = newId;
        name = newName;
        price = newPrice;
        quantity = newQuantity;
    }

    void deleteData() {
        id = 0;
        name = null;
        price = 0.0;
        quantity = 0;
    }
}