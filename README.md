# Exercicios_logica
Exercícios de lógica no C ou Python para aprimorar o uso dos repositórios
#include <stdio.h>
#include <stdlib.h>

int main()
{
    for (int i=150; i<=300; i++)
    printf("%d   ", i);

    int resultado = 0;
    for (int i = 1; i <= 1000; i++)
    resultado += i;
    printf("%d ", resultado);