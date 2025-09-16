package exc;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // cria o scanner

        int a, b, c, aux;

        System.out.print("Digite o primeiro numero: ");
        a = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        b = sc.nextInt();

        System.out.print("Digite o terceiro numero: ");
        c = sc.nextInt();

        // Ordenação
        if (a > b) { aux = a; a = b; b = aux; }
        if (a > c) { aux = a; a = c; c = aux; }
        if (b > c) { aux = b; b = c; c = aux; }

        System.out.println("Ordenados: " + a + " " + b + " " + c);

        sc.close(); // boa prática fechar o scanner
    }
}