import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
    private List<Produto> itens;

    public CarrinhoCompra() {
        this.itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        itens.add(produto);
    }

    public void exibirCarrinho() {
        for (Produto produto : itens) {
            produto.listarDados();
            System.out.println();
        }
    }

    public float fecharCompra() {
        float total = 0;
        for (Produto produto : itens) {
            total += produto.preco * produto.quantidade;
        }
        return total;
    }
}