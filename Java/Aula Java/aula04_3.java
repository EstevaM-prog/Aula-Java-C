import java.util.Scanner; // Switch case

public class aula04_3 {

    public static void main(String[] args) {
        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor inteiro:");

        int num = teclado.nextInt();

        switch(num){
            case 0:
                System.out.println("A variavel recebeu o valor de 0");
                break;
            case 1:
                System.out.println("A variavel recebeu o valor de 1");
                break;
            case 2:
                System.out.println("A variavel recebeu o valor de 2");
                break;
            case 3:
                System.out.println("A variavel recebeu o valor de 3");
                break;
            default:
                System.out.println(" A variavel recebeu qualquer outro valor não declarado acima");
        }
        
        teclado.close();
    }
}
