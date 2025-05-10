import java.util.Scanner;
// ctrl=0 = resolve os erros do código

public class Calculadora {
    public static void main (String[] args) {
    	// Declaração de variáveis 
    	Scanner leitor = new Scanner (System.in);
    	int numero1 = 0;
    	int numero2 = 0;
    	int resultado = 0; 
    	
    	// Entrada de dados 
    	System.out.print("Digite o primeiro numero; ");
    	numero1 = leitor.nextInt();
    	
    	System.out.print("Digite o segundo numero; ");
         numero2 = leitor.nextInt();
         
         leitor.close();
         //  leitor.close(); é para cortar a conexão entre o teclado e a máquina 
         
         // Processamento
         resultado = (numero1 + numero2);
         
         // Saída de dados 
         System.out.println("O resultado da soma é: " + resultado);
           
        
    }
}
