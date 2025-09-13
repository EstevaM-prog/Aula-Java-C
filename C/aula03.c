#include <stdio.h>
    int main() {
    int a , b , c , d , e;
    a=5;
    b=6;
    c=!(a<b);
    d=(a<b)&&!(b>7);
    e=!(a<b)||(b>7);
    printf("c = %d \n",c);//0 - falso
    printf("d = %d \n",d);//1 - verd
    printf("e = %d \n",e);//0 - falso
    return 0;
    }


    int main() {
        int a , b ;
        //Solicitar valores para a , b
        printf("Digite um número para var a: ");
        scanf("%d",&a);
    
        printf("Digite um número para var b: ");
        scanf("%d",&b);
    
        int maior = (a > b) ? a : b;

        printf("O maior número é: %d\n", maior);

        return 0;
    }

    /*
    Criar um código para solicitar a entrada de dois números,
    exemplo:

    a = 7
    b = 5

    mostrar os dois números e trocar os valores
    entre as variáveis
    nova saída:

    a = 5
    b = 7
    */

    #include <stdio.h>
    int main() {
        int a , b , aux;
        a=5;
        b=7;
        printf("Antes - a=%d , b=%d \n",a,b);
        aux=a;
        a=b;
        b=a;
        printf("Depois - a=%d , b=%d \n",a,b);

        return 0;
    }