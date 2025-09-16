import java.util.Scanner; // IF / ELSE

public class aula04 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = tec.nextInt();  // removido o "1"

        if (num >= 10) {
            System.out.println("Seu numero é maior ou igual a 10");
        } else {
            System.out.println("Seu numero é menor que 10");
        }

        tec.close();
    }
}
