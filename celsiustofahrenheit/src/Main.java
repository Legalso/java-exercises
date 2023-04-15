public class Main {
    public static void main(String[] args) {
        System.out.println("Conversor de temperaturas: Celsius --> Fahrenheit");

        double celsius = 25.5;
        System.out.println("A temperatura em Celsius é: " + celsius +"°C");

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