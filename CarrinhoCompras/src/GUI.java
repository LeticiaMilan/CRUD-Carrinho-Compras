import java.util.Scanner;

public class GUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarrinhoCompra carrinho = new CarrinhoCompra();

        System.out.println("Adicione os produtos ao carrinho:");

        while (true) {
            System.out.print("Código do Produto (ou digite 0 para finalizar o pedido): ");
            int codigo = scanner.nextInt();
            if (codigo == 0) {
                break;
            }

            scanner.nextLine(); 

            System.out.print("Descrição do Produto: ");
            String descProduto = scanner.nextLine();

            System.out.print("Preço do Produto: R$ ");
            double preco = scanner.nextDouble();

            System.out.print("Quantidade do Produto: ");
            int quantidade = scanner.nextInt();

            carrinho.adicionarProduto(new Produto(codigo, descProduto, preco, quantidade));
        }

        System.out.println("----------------------------------------");
        System.out.println("Carrinho de Compras:");
        System.out.println("----------------------------------------");
        carrinho.exibirCarrinho();
        System.out.println("Total: R$ " + carrinho.fecharCompra());
        System.out.println("----------------------------------------");

        scanner.close();
    }
}