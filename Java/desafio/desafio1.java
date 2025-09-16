package desafio; // Desafio de qual numero e maior

import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = teclado.nextInt();

        System.out.print("Digite outro numero: ");
        int num2 = teclado.nextInt();

        if (num > num2){
            System.out.println("O Numero: \n" + num + " e maior que o " + num2);
        }else{
            System.out.println("O Numero: " + num2 + " e maior que o " + num);
        }

        teclado.close();
    }
}
