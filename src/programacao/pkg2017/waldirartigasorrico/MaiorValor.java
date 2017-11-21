/*
 Crie uma classe java MaiorValor que contenha um métodoque que 
 receba dois números inteiros e imprima o maior deles
 */
package programacao.pkg2017.waldirartigasorrico;
import java.util.Scanner;


public class MaiorValor 
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
            System.out.println("O Maior Numero é " + numA);
        }
        else
        {
            System.out.println("O Maior Numero é " + numB);
 
        }
    }    
}
