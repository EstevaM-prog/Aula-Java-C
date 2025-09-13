#include <stdio.h>
    int main()
    {
        float av1,av2;
        
        printf("Digite a nota av1: ");
        scanf("%f",&av1);
        printf("Digite a nota av2: ");
        scanf("%f",&av2);

        printf(" av1: %.2f\n av2: %.2f\n",av1,av2);
        printf(" media: %.2f ",(av1+av2)/2);
        return 0;
    }
    /*
    Solicitar a entrada de duas notas: av1 e av2
    Mostrar as notas solicitadas
    Calcular a média entre av1 e av2
    Utilizar apenas av1 e av2
    Mostrar as notas com duas casas decimais
    */