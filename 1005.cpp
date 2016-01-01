#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
    double A, B, PesoA, PesoB, MEDIA;
    scanf("%lf", &A);
    scanf("%lf", &B);
    PesoA = 3.5;
    PesoB = 7.5;
    MEDIA = (A * PesoA + B * PesoB) / (PesoA + PesoB);
    printf("MEDIA = %.5lf\n", MEDIA);
    return 0;
}
