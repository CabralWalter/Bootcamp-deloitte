import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.print("Insira o Id do produto: ");
        produto.id = sc.nextInt();
        sc.nextLine();

        System.out.print("Insira o nome do produto: ");
        produto.nome = sc.nextLine();

        System.out.print("Insira o preço do produto: ");
        produto.preco = sc.nextDouble();

        System.out.print("Insira quantos produtos tem no estoque: ");
        produto.quantidade = sc.nextInt();

        produto.exibirDados();

        sc.close();
    }
}