import java.util.Scanner;
public class CalculoSalario {
    public static void main(String[] args) {

        //Ler o salário mensal atual de um funcionário e o percentual de reajuste.
        // Calcular e exibir o valor do novo salário.


        // Perguntas
        double salarioAtual, percentualReajuste, valorReajuste, novoSalario;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário atual: ");
        salarioAtual = scanner.nextDouble();
        System.out.print("Digite o percentual de reajuste: ");
        percentualReajuste = scanner.nextDouble();
        valorReajuste = salarioAtual * (percentualReajuste /100.0);
        novoSalario = salarioAtual + valorReajuste;
        System.out.println("Valor do reajuste: R$ " + valorReajuste);
        System.out.println("Novo salário: R$ " + novoSalario);

    }
}