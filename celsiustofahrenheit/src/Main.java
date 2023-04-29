import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de temperaturas: Celsius --> Fahrenheit");

        System.out.println("Qual a temperatura em Celsius?");
        double celsius = scanner.nextDouble();

        //double celsius = 25.5;
        //System.out.println("A temperatura em Celsius é: " + celsius +"°C");

        // Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é: (temperatura * 1.8) + 32.
        int fahrenheit = (int) ((celsius * 1.8) + 32);
        System.out.println("A temperatura convertida para Fahrenheit é: " + fahrenheit +"°F");
    }
    /* Resposta correta:
    public static void main(String[] args) {
        double temperaturaEmCelsius = 30.4;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);
    }
    */
}
    /*Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário atual: ");
                salarioAtual = scanner.nextDouble();
                System.out.print("Digite o percentual de reajuste: ");
                percentualReajuste = scanner.nextDouble();
                valorReajuste = salarioAtual * (percentualReajuste /100.0);
                novoSalario = salarioAtual + valorReajuste;
                System.out.println("Valor do reajuste: R$ " + valorReajuste);
                System.out.println("Novo salário: R$ " + novoSalario);*/