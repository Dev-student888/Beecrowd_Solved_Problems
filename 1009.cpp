#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
    char NOME;
    double SALARY, TOT_SALES, total;
    scanf("%s", &NOME);
    scanf("%lf", &SALARY);
    scanf("%lf", &TOT_SALES);
    total = (TOT_SALES * 15 / 100) + SALARY;
    printf("TOTAL = R$ %.2f\n", total);
    return 0;
}
