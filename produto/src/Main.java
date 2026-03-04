import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.print("Insira o id do produto: ");
        product.id = sc.nextInt();
        sc.nextLine();

        System.out.print("Insira o nome do produto: ");
        product.name = sc.nextLine();

        System.out.print("Insira o preço do produto: ");
        product.price = sc.nextDouble();

        System.out.print("Insira quantidade em estoque:");
        product.quantity = sc.nextInt();

        product.showData();

        sc.close();
    }
}