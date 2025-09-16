#include <stdio.h>
    int main() {
    int a,b,c;
    a=5;//a=5
    b=2;//b=2
    c=10;//c=10
    a+=b;//a=a+b//a=5+2//a=7
    c-=a;//c=c-a//c=10-7//c=3
    a%=b;//a=a%b//a=7%2//a=1
    printf(" a=%d \n b=%d \n c=%d",a,b,c);
    return 0;
    }

    int main() {
    int a=10;//10
    //a++;//a=a+1//a+=1
    //a++;//12
    //++a;//13
    //++a;//14
    a+=4;
    printf(" a = %d\n",a);//14
    a--;//13
    a--;//12
    --a;//11
    printf(" a = %d\n",a);//11
    return 0;
    }

    