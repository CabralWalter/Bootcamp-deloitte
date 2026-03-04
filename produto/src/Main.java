import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        int opcao = 0;

        while (opcao != 3) {

            System.out.println("\n1 - Cadastrar Produto");
            System.out.println("2 - Exibir Produto");
            System.out.println("3 - Sair");
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
                    break;

                case 2:
                    product.showData();
                    break;

                case 3:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}