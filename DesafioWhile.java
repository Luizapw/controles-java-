package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Informe a nota: ");
			nota =  entrada.nextDouble();
			
			total +=nota;
			quantidadeDeNotas++;
		}
		//Calcular a m?dia:
		double media = total / quantidadeDeNotas;
		System.out.println("Media = " + media);
		
		entrada.close();
	}
}
