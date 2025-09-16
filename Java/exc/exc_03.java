package exc;

import java.util.Scanner;

public class exc_03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int num = teclado.nextInt();

        switch (num) {
            case 0:
                System.out.println("A variavel recebeu o Valor 0");
                break;

            case 1:
                System.out.println("A variavel recebeu o Valor 1");
                break;

            case 2:
                System.out.println("A variavel recebeu o Valor 2");
                break;

            default:
                System.out.println("A variavel recebeu qualquer outro valor não testado acima");
        }

        teclado.close();
    }
}
