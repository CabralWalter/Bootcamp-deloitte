public class Produto {

    int id;
    String nome;
    double preco;
    int quantidade;

    void exibirDados() {
        System.out.println("\n--- Dados do Produto ---");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}