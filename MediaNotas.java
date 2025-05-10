import java.util.Scanner;

public class MediaNotas {
public static void main (String[] args) {
    // Declaração de variáveis
    Scanner leitor = new Scanner (System.in);
    
    double notap1 = 0;
    double notap2 = 0;
    double notap3 = 0;
    double media = 0;
     
    // Entrada de dados
    System.out.print("Informe a nota da primeira prova");
    notap1 = leitor.nextDouble();
    
    System.out.print("Informe a nota da segunda prova");
    notap2 = leitor.nextDouble();
    
    System.out.print("Informe a nota da terceira prova");
    notap3 = leitor.nextDouble();
     
    leitor.close();
    
    // Processamento
    media = ((notap1 + notap2 + notap3) / 3);
    
    //Saída de dados 
    System.out.println("A média do curso é: " + media);
    
}
}
