public class Produtos {

    private String produto;
    private int quantidade;
    private double preco;

    public Produtos(String produto, int quantidade, double preco) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void adicionarProduto(int qtd) {
        this.quantidade += qtd;
    }

    public void removerProduto(int qtd) {
        if (qtd <= this.quantidade) {
            this.quantidade -= qtd;
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto: " + produto +
                " | Quantidade: " + quantidade +
                " | Preço: R$" + preco;
    }
}
