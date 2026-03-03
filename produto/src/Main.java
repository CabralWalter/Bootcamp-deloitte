import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o Id do produto: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Insira o nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Insira o preço do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Insira quantos produtos tem no estoque: ");
        int quantidade = sc.nextInt();

        System.out.println("\n ---Dados do Produto---");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("preco: " + preco);
        System.out.println("quantidade: " + quantidade);

    }
}

