
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Calculadora {
    public static void main (String[] args)
    { //abre public main
        //declarações
    InputStream entrada = System.in;
    Scanner scanner = new Scanner (entrada);
    float a, b, valor, igual; 
    String op;
       //fimDeclarações
    
        System.out.println("Siga as instruções a seguir para usar a calculadora \n"); //mensagem inicial
               
        System.out.println("Digite o primeiro valor");
        a = scanner.nextFloat(); //a Receberá o primeiro valor
        
        System.out.println("Digite a operação (Use + para soma, - para subtração, * para multiplicação e / para divisão");
        op=scanner.next();
 
        System.out.println("Digite segundo valor");
        b = scanner.nextFloat(); //b Receberá o segundo valor
                
        if (op.equals("+")) //em caso de soma
            {
            
                igual=soma(a, b);
                    System.out.println("O resultado da soma é: " +igual);
            /*valor = (a+b);
                System.out.println("O resultado da soma é: " +valor); //mostra resultado em caso de soma
                */
            }
        if (op.equals("-")) //em caso de subtraçao/
            {
                        valor = (a-b); 
                System.out.println("O resultado da subtração é: " +valor); //mostra resultado em caso de subtração
            }
        if (op.equals("*"))
            {
            valor = (a*b);
                System.out.println("O resultado da multiplicação é: "+valor); //mostra resultado em caso de multiplicação
            }
        if (op.equals("/"))
            {
             divide(a,b);    
            
            
                /* valor = (a/b);
                System.out.println("O resultado da divisão é: " +valor);  //mostra resultado em caso de divisão
                 */
             }
        
        } //fecha public main
    
        public static float soma(float a, float b) 
        {//abre public soma
        float ress;
        ress = a+b;
        return ress;
            
        }//fecha public soma
    
        public static void divide(float a, float b) 
        {//abre divide
        float resd;
        
        if(b==0)
        {
            System.out.println("Erro! Você não pode dividir um número por 0.");
        return;
        }
        resd = a/b;
            System.out.println("O resultado da divisão é: " +resd);
            
        }//fecha divide 
        
    } //fecha class


