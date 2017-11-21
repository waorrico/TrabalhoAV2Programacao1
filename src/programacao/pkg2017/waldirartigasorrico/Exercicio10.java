/*
Crie uma classe java contenha um método que receba um número inteiro e imprima,
em ordem decrescente, o valor do número até 0.
 */
package programacao.pkg2017.waldirartigasorrico;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Exercicio10 
{
int numero;
int i = 0;

  public static void main(String[] args) 
    {
        int numero;
        int i;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero Inteiro: ");
        numero = s.nextInt();
        i=numero;
        while (i <= numero)
        {
            System.out.println( numero-1);
            numero = --numero;
            i--;
            if (i == 0)
            {
                break;
            }
        }
    }
}
