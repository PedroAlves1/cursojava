 /*
 * 
 * Rotina 
 * 
 * Declare a,b,c, maior, menor
 * Escreva "Digite o primeiro valor
 * Receba a //8
 * Escreva "Digite o segundo valor"
 * Receba b //4
 * Escreva "Digite o terceiro valor"
 * Receba c //2
 * 
 * Se ((a>b)E(a>c)) então
 *     //letra<-"a"
 *     maior<-a\'
 * Senão
 *   Se (b>c) 
 *     //letra<-"b"
 *     maior<-b
 *   Senão
 *     //letra<-"c"
 *     maior<-c
 *   FimSe
 * 
 * Se ((a<b)E(a<c) então
 *  menor<-a
 *    Senão
 *      Se(b<c)
 *      menor<-b
 *      Senão
 *      menor<-c
 * 
 * FimSe
 * 
 * Escreva "O maior valor é", maior
 * Escreva "O menor valor é", menor
 * 
 * FimRotina
 * 
 */
package projeto.pkg1;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class ProjetoValores {

    public static void main(String[] args) {
        try {
            InputStream entrada = System.in;
            Scanner scanner = new Scanner(entrada);

            float A, B, C;
            String letra;

            System.out.println("Digite o valor de A");
            A = scanner.nextFloat();

            System.out.println("Digite o valor de B");
            B = scanner.nextFloat();

            System.out.println("Digite o valor de C");
            C = scanner.nextFloat();

            if ((A > B) && (A > C)) {
                letra = "A";
            } else {
                if (B > C) {
                    letra = "B";
                } else {
                    letra = "C";
                }
            }
            System.out.println("O maior é o: " + letra);

        } catch (Exception e) {
            System.out.println("Erro: Coloque os valores numéricos corretamente na ordem informada, não use letras.");
        }
    }
}
