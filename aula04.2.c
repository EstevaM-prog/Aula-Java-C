/*
    trocas=n*(n-1)/2 n=quant de var
    trocas=2*(2-1)/2 trocas=1
    trocas=3*(3-1)/2 trocas=3
    trocas=4*(4-1)/2 trocas=6
    A   B   C   D
    6   4   3   1       if(a>b) troca
    4   6   3   1       if(b>c) troca
    4   3   6   1       if(c>d) troca
    4   3   1   6       if(a>b) troca
    3   4   1   6       if(b>c) troca
    3   1   4   6       if(a>b) troca
    1   3   4   6
*/
#include <stdio.h>
int main (){
      int a, b, c, d,trocas, aux;
      trocas=0;
      printf ("Digite o valor para a: ");
      scanf ("%d", &a);//6
      printf ("Digite o valor para b: ");
      scanf ("%d", &b);//4
      printf ("Digite o valor para c: ");
      scanf ("%d", &c);//3
      printf ("Digite o valor para d: ");
      scanf ("%d", &d);//1
     
      printf("Antes  a=%d , b=%d , c%d , d=%d \n",a,b,c,d);
      if(a>b){
         aux=a;
         a=b;
         b=aux;
         trocas++;
      }
      if(b>c){
          aux=b;
          b=c;
          c=aux;
          trocas++;
      }
      if(c>d){
          aux=c;
          c=d;
          d=aux;
          trocas++;
      }
      if(a>b){
         aux=a;
         a=b;
         b=aux;
         trocas++;
      }
      if(b>c){
          aux=b;
          b=c;
          c=aux;
          trocas++;
      }
      if(a>b){
         aux=a;
         a=b;
         b=aux;
         trocas++;
      }
      printf("Depois a=%d , b=%d , c=%d , d=%d \n",a,b,c,d);
      printf("Trocas = %d",trocas);
     
      return 0;
}