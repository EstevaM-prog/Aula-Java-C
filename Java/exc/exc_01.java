package exc;

public class exc_01 {
    public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println("------ OPERADORES ARITMÉTICOS ------");
        System.out.println("Soma (a + b): " + (a + b));
        System.out.println("Subtração (a - b): " + (a - b));
        System.out.println("Multiplicação (a * b): " + (a * b));
        System.out.println("Divisão (a / b): " + (a / b));
        System.out.println("Módulo (a % b): " + (a % b));

        System.out.println("\n------ OPERADORES RELACIONAIS ------");
        System.out.println("a == b ? " + (a == b));
        System.out.println("a != b ? " + (a != b));
        System.out.println("a > b ? " + (a > b));
        System.out.println("a < b ? " + (a < b));
        System.out.println("a >= b ? " + (a >= b));
        System.out.println("a <= b ? " + (a <= b));

        System.out.println("\n------ OPERADORES LÓGICOS ------");
        boolean x = true;
        boolean y = false;
        System.out.println("x && y (E lógico): " + (x && y));
        System.out.println("x || y (OU lógico): " + (x || y));
        System.out.println("!x (negação): " + (!x));

        System.out.println("\n------ OPERADORES DE ATRIBUIÇÃO ------");
        int c = 5;
        System.out.println("Valor inicial de c: " + c);
        c += 2;
        System.out.println("c += 2: " + c);
        c -= 1;
        System.out.println("c -= 1: " + c);
        c *= 3;
        System.out.println("c *= 3: " + c);
        c /= 2;
        System.out.println("c /= 2: " + c);
        c %= 2;
        System.out.println("c %= 2: " + c);

        System.out.println("\n------ OPERADORES DE INCREMENTO/DECREMENTO ------");
        int d = 10;
        System.out.println("Valor inicial de d: " + d);
        d++;
        System.out.println("d++: " + d);
        d--;
        System.out.println("d--: " + d);
    }
}
}
