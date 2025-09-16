package desafio;

import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = teclado.nextInt();

        System.out.println("Tabuada do " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        teclado.close();
    }
}

