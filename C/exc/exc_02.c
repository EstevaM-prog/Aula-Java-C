#include <stdio.h>

int main() {
    int num;

    // Entrada de dados
    printf("Digite um número inteiro: ");
    scanf("%d", &num);

    // Verificação de par ou ímpar
    if (num % 2 == 0) {
        printf("O número %d é PAR.\n", num);
    } else {
        printf("O número %d é ÍMPAR.\n", num);
    }

    return 0;
}
