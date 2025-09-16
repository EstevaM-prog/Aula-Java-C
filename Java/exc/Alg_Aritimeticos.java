package exc;
import java.util.Scanner;

public class Alg_Aritimeticos {
    public static void main(String[] args) {
        int num, num2;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        num = teclado.nextInt();

        System.out.print("Digite o segundo numero: ");
        num2 = teclado.nextInt();

        // Adição
        int soma = num + num2;
        System.out.println("A soma dos seus numeros " + num + " + " + num2 + " = " + soma);

        // Subtração

        int subtacao = num - num2;
        System.out.println("A subtração dos seus numeros " + num + " - " + num2 + " = " + subtacao);

        // Mutiplicação

        int mutiplicacao = num * num2;
        System.out.println("A mutiplicação dos seus numeros " + num + " * " + num2 + " = " + mutiplicacao);

        // Divisão

        int div = num / num2;
        System.out.println("A divisão dos seus numeros " + num + " * " + num2 + " = " + div);

        // Resto

        int resto = num % num2;
        System.out.println("O resto dos seus numeros " + num + " % " + num2 + " = " + resto);

        teclado.close();
    }
}

/* Ou fazer desse jeito
    public class Aritmeticos {
        public static void main(String[] args) {
            int a = 10;
            int b = 3;

            int soma = a + b;
            int sub = a - b;
            int mult = a * b;
            int div = a / b;       // divisão inteira
            int resto = a % b;     // resto da divisão

            a++; // a = 11
            b--; // b = 2

            System.out.println("Soma: " + soma);
            System.out.println("Subtração: " + sub);
            System.out.println("Multiplicação: " + mult);
            System.out.println("Divisão: " + div);
            System.out.println("Resto: " + resto);
            System.out.println("Incremento a: " + a);
            System.out.println("Decremento b: " + b);
        }
    }
*/