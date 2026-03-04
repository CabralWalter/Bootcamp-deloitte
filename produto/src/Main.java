import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        int opcao = 0;

        while (opcao != 5) {

            System.out.println("\n1 - Cadastrar Produto");
            System.out.println("2 - Exibir Produto");
            System.out.println("3 - Atualizar Produto");
            System.out.println("4 - Excluir Produto");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Insira o id do produto: ");
                    product.id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Insira o nome do produto: ");
                    product.name = sc.nextLine();

                    System.out.print("Insira o preço do produto: ");
                    product.price = sc.nextDouble();

                    System.out.print("Insira quantidade em estoque: ");
                    product.quantity = sc.nextInt();

                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    product.showData();
                    break;

                case 3:
                    System.out.print("Novo id: ");
                    int newId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Novo nome: ");
                    String newName = sc.nextLine();

                    System.out.print("Novo preço: ");
                    double newPrice = sc.nextDouble();

                    System.out.print("Nova quantidade: ");
                    int newQuantity = sc.nextInt();

                    product.updateData(newId, newName, newPrice, newQuantity);
                    System.out.println("Produto atualizado com sucesso!");
                    break;

                case 4:
                    product.deleteData();
                    System.out.println("Produto excluído com sucesso!");
                    break;

                case 5:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}