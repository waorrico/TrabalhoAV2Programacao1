/*
Crie uma classe java que contenha um método que receba dois números
Num-A e Num-B nessa ordem, e imprima em ordem inversa, isto é, se os
dados lidos forem Num-A = 5 e Num-B = 9, por exemplo, devem ser impresso
na ordem Num-A = 9 e Num-B = 5.
 */
package programacao.pkg2017.waldirartigasorrico;
import java.util.Scanner;

public class Exercicio12 
{

  public static void main(String[] args) 
    {
        int numA;
        int numB;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o numero A: ");
        numA = s.nextInt();
        System.out.println("Digite o numero B: ");
        numB = s.nextInt();
        
        if (numA > numB)
        {
            System.out.println("Numero A é " + numA + " Número B é " + numB);
        }
        else
        {
            System.out.println("Numero A é " + numB + " Número B é " + numA);
 
        }
    }
}
