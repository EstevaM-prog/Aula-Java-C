import java.util.Scanner; // IF / ELSE IF / ELSE

public class aula04_2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = tec.nextInt();

        if (num > 10) {
            System.out.println("Seu numero é maior que 10");
        } else if (num == 10) {
            System.out.println("Seu numero é igual a " + num);
        } else if (num > 30){
            System.out.println("Seu numero é menor que 30");
        } else {
            System.out.println("Seu numero é menor que 10");

        
        }
        tec.close();
    }
}