import java.util.Scanner;
public class Main {

        //Ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
        // Correção
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            double base, altura, area;
            System.out.print("Digite a base do retângulo: ");
            base = teclado.nextDouble();
            System.out.print("Digite a altura do retângulo: ");
            altura = teclado.nextDouble();
            area = base * altura;
            System.out.println("A área do retângulo é: " + area);

        /*
        // MEU CÓDIGO

        System.out.println("Calculadora de área do Retângulo");

        int base = 5;
        int altura = 10;
        System.out.println("A base do retângulo é: " + base);
        System.out.println("A altura do retângulo é: " + altura);

        // Dica: A fórmula para calcular a área do retângulo é A=b.h (base x altura)

        int area = base * altura;
        System.out.println("A área do retângulo é: " + area);

        // Alternativa

        import java.util.Scanner;
        public class CalculaAreaRetangulo {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base, altura, area;
        System.out.print("Digite a base do retangulo: ");
        base = teclado.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        altura = teclado.nextDouble();
        area = base * altura;
        System.out.println("--------------------------- ");
        System.out.println("A area do retangulo e: " + area);
        System.out.println("---------------------------
        } }


        • Importamos a classe Scanner para ler as entradas do usuário.
        • Criamos um objeto teclado para ler as entradas.
        • Pedimos para o usuário digitar a base do retângulo e armazenamos o valor lido na variável base.
        • Pedimos para o usuário digitar a altura do retângulo e armazenamos o valor lido na variável altura.
        • Calculamos a área do retângulo usando a fórmula base * altura e armazenamos o valor na variável area.
        • Imprimimos o valor da área usando o método println da classe System.out.

        */

    }
}