
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
        
        System.out.println("Digite a operação (Use + para soma, - para subtração, * para multiplicação, / para divisão e ^ para subtração");
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
                        valor=menos(a, b); 
                System.out.println("O resultado da subtração é: " +valor); //mostra resultado em caso de subtração
            }
        if (op.equals("*"))
            {
            valor=vezes(a, b);
                System.out.println("O resultado da multiplicação é: "+valor); //mostra resultado em caso de multiplicação
            }
        if (op.equals("/"))
            {
              valor=divide (a, b);
                System.out.println("O resultado da divisão é: " +valor);  //mostra resultado em caso de divisão
                
                             }
        if (op.equals("^"))
        {
            valor=potencia(a, b);
             System.out.println("O resultado da potenciação é: " +valor); //mostra resultado em caso de potencia
        }
       
        } //fecha public main
    
        public static float soma(float a, float b) 
        {//abre public soma
        float ress;
        ress = a+b;
        return ress;
            
        }//fecha public soma
 
        public static float menos(float a, float b) 
        { //abre menos
        float resu;
        resu = a-b;
        return resu;
            
        } //fecha menos
        
        public static float vezes(float a, float b)
        {//abre vezes
        float resv;
        resv = a*b;
        return resv;
        
        }//fecha vezes        
        public static float divide(float a, float b) 
        {//abre divide
        float resd;
        
        if(b==0)
        {
            System.out.println("Erro! Você não pode dividir um número por 0.");
        return 0;
        }
        resd = a/b;
        return resd;
        
        }//fecha divide 
       
        public static float potencia(float a, float b)
        { //abre potencia
        float resp;
        float total;
        
        total=1;
        for (int i=1; i<=b; i++)
        {
          total=total*a;
        }
        resp=total;
        return resp;
        }//fecha potencia
    } //fecha class


