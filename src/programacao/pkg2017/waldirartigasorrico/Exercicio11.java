/*
 Escreva um programa que imprima na tela a soma dos números ímpares entr 0 e 30
 e a multiplicação dos números apres entre 0 e 30.
 */
package programacao.pkg2017.waldirartigasorrico;

public class Exercicio11 
{
    public static void main(String[] args) 
    {
    int numeroInicial = 1;
    int qtdeDeNumeros = 30;
    int numeroFlag = 0;
    long somaDosNumerosImpares = 0;
    long multiplicacaoDosNumerosPares = 0;
    while (numeroInicial <= qtdeDeNumeros) 
    {
        boolean isPar = numeroInicial % 2 == 0 ? true : false;
        if (isPar) 
        {
            numeroFlag = numeroFlag + 1;
            if (numeroFlag != 1) 
            {
                multiplicacaoDosNumerosPares = multiplicacaoDosNumerosPares * numeroInicial;	
            }
            else 
            {
                multiplicacaoDosNumerosPares = numeroInicial;
            }	
        }
        else
        {
            somaDosNumerosImpares = somaDosNumerosImpares + numeroInicial;
        }
        numeroInicial = numeroInicial + 1;
        }
        System.out.println("Resultado soma dos números ímpares: " + somaDosNumerosImpares 
		          + "\n" + "Resultado multiplicação dos números pares: " + multiplicacaoDosNumerosPares + "\n");
    }
}

