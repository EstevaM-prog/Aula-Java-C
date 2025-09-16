#include <stdio.h> // Biblioteca

    int main() { // Principal 
        int a, b, c, aux; // declaração de variaveis

        printf("Digite tres numeros: "); // Input de Mensagem
        scanf("%d %d %d", &a, &b, &c); // Pause ate digitar

        // Ordenação simples (usando if e troca)
        if (a>b) { aux = a; a = b; b = aux; } 
        if (a>c) { aux = a; a = c; c = aux; }
        if (b>c) { aux = b; b = c; c = aux; }

        printf("Ordenados: %d %d %d\n", a, b, c); // Impressão da ordenação

        return 0;
    }