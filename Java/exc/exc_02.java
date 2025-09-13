package exc;

import java.util.Scanner; // import precisa estar fora da classe

public class exc_02 {
    public static void main(String[] args) {
        // Scanner para entrada do usuário
        Scanner leitor = new Scanner(System.in);

        int valor1, resultado; // Variáveis

        System.out.print("Digite um número: ");
        valor1 = leitor.nextInt();

        // cálculo do resto da divisão
        resultado = valor1 % 2;

        if (resultado == 1) {
            System.out.println("Ímpar");
        } else {
            System.out.println("Par");
        }

        leitor.close(); // sempre bom fechar o scanner
    }
}
