package desafio;

import java.util.Scanner;

public class desafio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = teclado.nextInt();

        if (num % 2 == 1) {
            System.out.println("Seu numero " + num + " e impar");
        } else {
            System.out.println("Seu numero " + num + " e par");
        }

        teclado.close();
    }
}

