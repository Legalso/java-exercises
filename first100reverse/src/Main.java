public class Main {
    public static void main(String[] args) {
        /* Escreva um programa que exibe os primeiros 100 números naturais.
        Faça versões usando for, while e do/while, mas dessa vez ao contrário */

        for (int x = 100; x >= 0; x--) {
            System.out.println("for: "+x);
        }

        int a = 100;
        while (a >= 0) {
            System.out.println("while: "+a);
            a--;
        }

        int b = 100;
        do {
            System.out.println("do while: "+b);
            b--;
        } while (b >= 0);
    }
}