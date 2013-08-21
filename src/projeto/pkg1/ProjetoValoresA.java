/*
 * Rotina
 * Declare mg, sp, es, rj 
 * Escreva "Digite o valor arrecadado em MG"
 * Receba mg //10000
 * Escreva "Digite o valor arrecadado em SP"
 * Receba sp //6000
 * Escreva "Digite o valor arrecadado em ES"
 * Receba es //3000
 * Escreva "Digite o valor arrecadado em RJ"
 * Receba rj //4000
 * calculo<- (mg+sp+es+rj)/200
 * Escreva "O valor para cada família é", calculo
 * FimRotina
 */

package projeto.pkg1;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class ProjetoValoresA 
    {
    public static void main (String[]arg)
    {
    InputStream entrada = System.in;
    Scanner scanner = new Scanner (entrada);
    float mg, sp, es, rj, total;
    try{
    
        System.out.println("Digite o valor arrecadado em MG");
        mg=scanner.nextFloat();
        
        System.out.println("Digite o valor arrecadado em SP");
        sp=scanner.nextFloat();
        
        System.out.println("Digite o valor arrecadado em ES");
        es=scanner.nextFloat();
        
        System.out.println("Digite o valor arrecadado em RJ");
        rj=scanner.nextFloat();
        
        
        total=((mg+sp+es+rj)/200);
        System.out.println("O valor para cada família é: " +total);
    }
    catch(Exception e)
    {
        System.out.println("Erro: Coloque os valores numéricos corretamente na ordem informada, não use letras.");
    }
    }
   }

