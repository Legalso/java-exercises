public class Main {
    public static void main(String[] args) {
        System.out.println("Conversor de temperaturas: Celsius --> Fahrenheit");

        int celsius = 25;
        int temperatura;
        temperatura = celsius;
        System.out.println("A temperatura em Celsius é: " + celsius +"°C");

        // Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é: (temperatura * 1.8) + 32.
        int fahrenheit = (int) ((temperatura * 1.8) + 32);
        System.out.println("A temperatura convertida para Fahrenheit é: " + fahrenheit +"°F");
    }
}