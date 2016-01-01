#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
    double A, B, C, PesoA, PesoB, PesoC, MEDIA;
    scanf("%lf", &A);
    scanf("%lf", &B);
    scanf("%lf", &C);
    PesoA = 2.0;
    PesoB = 3.0;
    PesoC = 5.0;
    MEDIA = (A * PesoA + B * PesoB + C * PesoC) / (PesoA + PesoB + PesoC);
    printf("MEDIA = %.1lf\n", MEDIA);
    return 0;
}
