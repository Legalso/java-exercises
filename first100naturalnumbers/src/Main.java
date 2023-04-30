public class Main {
    public static void main(String[] args) {
        /*Escreva um programa que exibe os primeiros 100 números naturais.
        Faça versões usando for, while e do/while*/

        for (int x = 0; x <= 100; x++) {
            System.out.println("for: "+x);
        }

        int i = 0;
        while (i <= 100) {
            System.out.println("while: " + i);
            i++;
        }

        int c = 0;
        do {
            System.out.println("do while: "+ c);
            c++;
        } while (c <= 100);
    }
}