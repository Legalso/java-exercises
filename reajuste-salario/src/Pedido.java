public class Pedido {
    int codigoPedido;
    String nomeCliente;
    int codigoProduto;
    int valorProduto;
    int totalProdutos;

    void valorPedido(int vlrproduto) {
        totalProdutos+=vlrproduto;
    }
    Pedido(int codigoPedido, String nomeCliente) {
        this.codigoPedido=codigoPedido;
        this.nomeCliente=nomeCliente;
    }
}