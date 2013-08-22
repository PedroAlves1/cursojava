/*
Rotina

Declare nota1, nota2, total, media

	Escreva "Digite a primeira nota"
		Receba nota1 //recebe a primeira nota

	Escreva "Digite a segunda nota"
		Receba nota2 //recebe a segunda nota

	total<-nota1 + nota2
	media<-total/2
	Escreva "Sua média foi", media

	Se (media < 3) Então
		Escreva"Reprovado!"
	SeNão
		Se (media < 6)
			Escreva "Recuperação!"
		
		Senão
			Escreva "Aprovado"
		Fimse
	Fimse
FimRotina
*/

//package projeto.pkg1;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class ProjetoNotas 
{
    public static void main(String[] args)
    {
                try
      {
        InputStream entrada = System.in;
        Scanner scanner = new Scanner (entrada);
        
        
        float nota1, nota2, media;
        
        System.out.println("Digite primeira nota");
        nota1=scanner.nextFloat();
        
        System.out.println("Digite a segunda nota");
        nota2=scanner.nextFloat();
        
    
        media=(nota1+nota2)/2;
        System.out.println("A média é:" +media);
        
            if (media<3)
            {
            System.out.println("Reprovado!");
            }
            else
                if(media<5)
            {
                System.out.println("Recuperação!");
            }
                else
                {
                    System.out.println("Aprovado!");
                }
      }  //Um comentário
    
        catch(Exception e)
        {
            System.out.println("Erro: Coloque os valores numéricos corretamente na ordem informada, não use letras.");
        }
}   
}
                
    
