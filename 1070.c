#include <stdio.h>

int isItOdd(int n){
    if(n % 2 == 1){
        return 0;
    }
    return 1;
}

int main(){
    int contador = 0;
    int X;
    scanf("%d", &X);
    for(int i = 0; i >= 0; i++){
        if(contador == 6){
            break;
        }
        if(isItOdd(X) == 0){
            printf("%d\n", X);
            contador++;
        }
        X++;
    }
    return 0;
}
