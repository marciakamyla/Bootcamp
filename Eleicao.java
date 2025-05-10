import java.util.Scanner;

public class Eleicao {
public static void main (String[] args) {
	//Declaração de variáveis
	Scanner leitor = new Scanner(System.in);
	double qtdVotoA = 0;
	double qtdVotoB = 0;
	double qtdVotoC = 0;
	double qtdVotoBranco = 0;
	double qtdVotoNulo = 0;
	
	double totalVotos = 0;
	double totalVotosValidos = 0;
	
	double percentualA = 0;
	double percentualB = 0;
	double percentualC = 0;
	double percentualVotoBranco = 0;
	double percentualVotoNulo = 0;
	
	//Entrada de dados
	System.out.print("Informe a quantidade de Votos do A: ");
	qtdVotoA = leitor.nextDouble();
	
	System.out.print("Informe a quantidade de Votos do B: ");
	qtdVotoB = leitor.nextDouble();
	
	System.out.print("Informe a quantidade de Votos do C: ");
	qtdVotoC = leitor.nextDouble();
	
	System.out.print("Informe a quantidade de Votos Branco: ");
	qtdVotoBranco = leitor.nextDouble();
	
	System.out.print("Informe a quantidade de Votos Nulos: ");
	qtdVotoNulo = leitor.nextDouble();
	
	leitor.close();
	
	//Processamento
	totalVotos = (qtdVotoA + qtdVotoB + qtdVotoC + qtdVotoBranco + qtdVotoNulo);
	totalVotosValidos = (qtdVotoA + qtdVotoB + qtdVotoC);
	
	percentualA = ((100 * qtdVotoA) / totalVotosValidos);
	percentualB = ((100 * qtdVotoB) / totalVotosValidos);
	percentualC = ((100 * qtdVotoC) / totalVotosValidos);
	percentualVotoBranco = ((100 * qtdVotoBranco) / totalVotos);
	percentualVotoNulo = ((100 * qtdVotoNulo) / totalVotos);
	
	//Saída de dados
	System.out.println("Candidato A: " + percentualA + "&");
	System.out.println("Candidato B: " + percentualB + "&");
	System.out.println("Candidato C: " + percentualC + "&");
	System.out.println("Branco: " + percentualVotoBranco + "&");
	System.out.println("Nulo: " + percentualVotoNulo + "&");
	
	
	
}
}
