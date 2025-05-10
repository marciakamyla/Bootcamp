import java.util.Scanner;

public class ComputadorBordo {
public static void main (String[] args) {
	//Declaração de varáveis
	Scanner leitor = new Scanner (System.in);
	double distancia = 0;
	double tempo = 0;
	double consumo = 0;
	double velocidadeMedia = 0;
	double quantidadeCombustivel = 0;
	
	//Entrada de dados
	System.out.print("Informe a distancia");
	distancia = leitor.nextDouble();
	
	System.out.print("Informe o tempo");
	tempo = leitor.nextDouble();
	
	System.out.print("Informe o consumo");
	consumo = leitor.nextDouble();
	
	leitor.close();
	
	//Processamento
	velocidadeMedia = (distancia / tempo);
	quantidadeCombustivel = (distancia / consumo);
	
	//Saída de dados
	System.out.println("A velocidade Media é: " + velocidadeMedia);
	System.out.println("A quantidade de Combustivel é:" + quantidadeCombustivel);
	
}
}
