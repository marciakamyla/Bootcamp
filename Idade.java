import java.util.Calendar;
import java.util.Scanner;

public class Idade {
    public static void main (String[] args) {
    	//Declaração de variáveis
    	Scanner leitor = new Scanner (System.in);
    	int diaNascimento = 0;
    	int mesNascimento = 0;
    	int anoNascimento = 0;
    	
    	int diaHoje = 0;
    	int mesHoje = 0;
    	int anoHoje = 0;
    	
    	int diaQtd = 0;
    	int mesQtd = 0;
    	int anoQtd = 0;
    	
    	//Entrada de dados 
    	System.out.print("Digite o dia de nascimento: ");
    	diaNascimento = leitor.nextInt();
    	System.out.print("Digite o mes de nascimento: ");
    	mesNascimento = leitor.nextInt();
    	System.out.print("Digite o ano de nascimento: ");
    	anoNascimento = leitor.nextInt();
    	
    	leitor.close();
    	
    	//Processamento
    	diaHoje = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    	mesHoje = Calendar.getInstance().get(Calendar.MONTH) + 1;
    	anoHoje = Calendar.getInstance().get(Calendar.YEAR);
    	
    	diaQtd = Math.abs(diaHoje - diaNascimento);
    	mesQtd = Math.abs(mesHoje - mesNascimento);
    	anoQtd = Math.abs(anoHoje - anoNascimento);
    	
    	//Saída de dados 
    	System.out.println("A diferença de dia é: " + diaQtd);
    	System.out.println("A diferença de mes é: " + mesQtd);
    	System.out.println("A diferença de ano é: " + anoQtd);
    	
    }
}
