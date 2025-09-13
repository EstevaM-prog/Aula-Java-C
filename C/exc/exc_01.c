#include <stdio.h>

int main() {
    float peso, altura, imc;

    // Entrada de dados
    printf("Digite seu peso em kg: ");
    scanf("%f", &peso);

    printf("Digite sua altura em metros: ");
    scanf("%f", &altura);

    // Cálculo do IMC
    imc = peso / (altura * altura);

    // Exibe resultado
    printf("\nSeu IMC é: %.2f\n", imc);

    // Classificação
    if (imc < 18.5) {
        printf("Classificação: Abaixo do peso\n");
    } else if (imc < 24.9) {
        printf("Classificação: Peso normal\n");
    } else if (imc < 29.9) {
        printf("Classificação: Sobrepeso\n");
    } else if (imc < 34.9) {
        printf("Classificação: Obesidade Grau I\n");
    } else if (imc < 39.9) {
        printf("Classificação: Obesidade Grau II\n");
    } else {
        printf("Classificação: Obesidade Grau III\n");
    }

    return 0;
}
