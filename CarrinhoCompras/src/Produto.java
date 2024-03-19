public class Produto {
    private int codigo;
    private String descProduto;
    double preco;
    int quantidade;

    public Produto(int codigo, String descProduto, double preco, int quantidade) {
        this.codigo = codigo;
        this.descProduto = descProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void listarDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Descrição do Produto: " + descProduto);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}