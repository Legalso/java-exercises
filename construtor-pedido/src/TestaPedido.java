import java.util.Scanner;
public class TestaPedido {
    public static void main(String[] args){
        String resp, nome;
        int codigo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu código: ");
        codigo=teclado.nextInt();
        teclado.nextLine();
        System.out.println("Digite o seu nome: ");
        nome = teclado.nextLine();
        Pedido pedido1 = new Pedido(codigo,nome);
        do{
            System.out.println("Digite o valor do produto:");
            pedido1.valorPedido(teclado.nextInt());
            System.out.println("Deseja continuar? Tecle [S] para Sim ou [N] para Não");
            resp = teclado.next();
        }while(resp.equals("S") || resp.equals("s"));
        System.out.println(pedido1.nomeCliente+ " o valor total do seu pedido é " + pedido1.totalProdutos);
    }
}